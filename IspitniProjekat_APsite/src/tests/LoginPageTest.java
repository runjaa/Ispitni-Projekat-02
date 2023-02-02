package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    public HomePage homePage;
    public LoginPage loginPage;

    String validEmail = "qa.code.projekat@gmail.com";
    String validPassword = "Qa@12345";
    String myAccountLabel = "MY ACCOUNT";

    @Test
    public void verifyLogin(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        homePage.baseURL();
        homePage.clickOnSignInButton();
        loginPage.login(validEmail, validPassword);
        loginPage.verifyLoginPage(myAccountLabel);

        try {
            Thread.sleep(5000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
}
