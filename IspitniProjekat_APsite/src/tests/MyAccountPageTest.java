package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class MyAccountPageTest extends BaseTest {

    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;

    String signOutVerification = "AUTHENTICATION";

    String validEmail = "qa.code.projekat@gmail.com";
    String validPassword = "Qa@12345";
    String myAccountLabel = "MY ACCOUNT";

    @Test
    public void validateSignOut(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        myAccountPage = new MyAccountPage(driver);

        homePage.baseURL();
        homePage.clickOnSignInButton();
        loginPage.login(validEmail, validPassword);
        myAccountPage.clickSignOutButton();
        loginPage.verifySignOut(signOutVerification);

        try {
            Thread.sleep(5000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}   
