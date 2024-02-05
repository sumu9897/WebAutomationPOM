package uitilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class DriverSetup {

//    public WebDriver browser;
    public static String browserName = System.getProperty("browser", "Chrome");

    private static final ThreadLocal<WebDriver> LOCAL_BROWSER =new ThreadLocal<>();

    public static void setBrowser(WebDriver browser) {
        DriverSetup.LOCAL_BROWSER.set(browser);
    }

    public static WebDriver getBrowser() {
        return LOCAL_BROWSER.get();
    }

    public WebDriver getBrowser(String browserName) {
        if(browserName.equalsIgnoreCase("Chrome"))
            return new ChromeDriver();
        else if (browserName.equalsIgnoreCase("eEge"))
            return new EdgeDriver();
        else if (browserName.equalsIgnoreCase("Firefox"))
            return new FirefoxDriver();
        else {
            throw new RuntimeException("Browser is not available with the given name: " + browserName);
        }

    }

    @BeforeTest
    public void openABrowser(){
        WebDriver browser = getBrowser(browserName);
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        setBrowser(browser);

    }

    @AfterTest
    public void quiteBrowser(){
        getBrowser().quit();
    }
}
