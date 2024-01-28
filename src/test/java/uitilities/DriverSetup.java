package uitilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverSetup {

//    public WebDriver browser;
    public static String browserName = System.getProperty("browser", "Chrome");

    private static final ThreadLocal<WebDriver> LOCAL_BROWSER =new ThreadLocal<>();

    public static WebDriver getBrowser() {
        return LOCAL_BROWSER.get();
    }

    public static void setBrowser(WebDriver browser) {
        DriverSetup.LOCAL_BROWSER.set(browser);
    }

    @BeforeTest
    public void openABrowser(){
        browser = getBrowser(browserName);
        browser.manage().window().maximize();
    }

    @AfterTest
    public void quiteBrowser(){
        browser.quit();
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
}
