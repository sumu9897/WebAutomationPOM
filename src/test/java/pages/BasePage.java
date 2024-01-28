package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static uitilities.DriverSetup.getBrowser;

public class BasePage {

    public WebElement getElement(By locator){

        return getBrowser().findElement(locator);

    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }
}
