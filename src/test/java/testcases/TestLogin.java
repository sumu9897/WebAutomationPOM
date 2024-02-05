package testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import uitilities.DriverSetup;

public class TestLogin extends DriverSetup {


    HomePage homePage =new HomePage();
    SignInPage signInPage = new SignInPage();
    @Test
    public void testLogin(){

        getBrowser().get(homePage.homepageURL);
        homePage.hoverOnElement(homePage.signInButton);
        homePage.clickOnElement(homePage.LoginOption);
        signInPage.writeOnAElement(signInPage.emailInputBox, signInPage.email);
        signInPage.writeOnAElement(signInPage.passwordField, signInPage.password);
        signInPage.clickOnElement(signInPage.rememberMe);
        signInPage.clickOnElement(signInPage.loginButton);




    }
}
