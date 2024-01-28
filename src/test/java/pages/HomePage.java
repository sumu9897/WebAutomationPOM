package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public String homepageURL = "https://www.walmart.com";
    public String homepageTittle ="Walmart has deals on the most-wanted gifts";

   public By signInButton = By.xpath("//i[@class='ld ld-User']");
   public  By getSignInCreateAccountButton =By.xpath("//button[normalize-space()='Sign in or create account']");


}
