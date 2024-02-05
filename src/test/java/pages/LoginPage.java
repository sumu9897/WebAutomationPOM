package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public String loginPageUrl = "https://www.saucedemo.com/";
    public String loginPageTitle ="Swag Labs";

    public By emailInputBox = By.xpath("//input[@id='user-name']");
    public By passwordInputBox = By.xpath("//input[@id='password']");

    public  By errorMeg = By.xpath("h3[data-test='error']");

    public By loginButton =By.xpath("//input[@id='login-button']");






}
