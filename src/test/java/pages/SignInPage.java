package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{
    public String email ="lehak79450@taobudao.com";
    public String password = "123456aA";

    public String emailErrorText ="Please enter a valid email address.";

    public By emailInputBox = By.xpath("//input[@id='react-aria-1']");

    public By emailError = By.xpath("//span[@id='react-area-2']");

    public By continueButton =By.xpath("//button[@id='login-continue-button']");
}
