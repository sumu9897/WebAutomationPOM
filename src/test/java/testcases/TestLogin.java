package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;
import pages.SignInPage;
import uitilities.DriverSetup;

public class TestLogin extends DriverSetup {


//    HomePage homePage =new HomePage();

    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    @Test
    public void testLoginWithValidCredentials(){

        getBrowser().get(loginPage.loginPageUrl);

        loginPage.writeOnAElement(loginPage.emailInputBox, "standard_user");
        loginPage.writeOnAElement(loginPage.passwordInputBox, "secret_sauce");
        loginPage.clickOnElement(loginPage.loginButton);
        Assert.assertEquals(getBrowser().getCurrentUrl(),productPage.productPageURL);

    }

    @Test
    public void testLoginWithInvalidPassword(){

        getBrowser().get(loginPage.loginPageUrl);

        loginPage.writeOnAElement(loginPage.emailInputBox, "standard_user");
        loginPage.writeOnAElement(loginPage.passwordInputBox, "secret_");
        loginPage.clickOnElement(loginPage.loginButton);
        Assert.assertTrue(loginPage.getElement(loginPage.errorMsg).isDisplayed());
        Assert.assertEquals(loginPage.getElementText(loginPage.errorMsg),"Epic sadface: Username and password do not match any user in this service");

    }


}
