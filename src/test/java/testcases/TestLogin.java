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
    public void testLogin(){

        getBrowser().get(loginPage.loginPageUrl);

        loginPage.writeOnAElement(loginPage.emailInputBox, "standard_user");
        loginPage.writeOnAElement(loginPage.passwordInputBox, "secret_sauce");
        loginPage.clickOnElement(loginPage.loginButton);
        Assert.assertEquals(getBrowser().getCurrentUrl(),productPage.productPageURL);

    }
}
