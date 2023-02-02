package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends BaseTest{

    public HomePage homePage;
    public LoginPage loginPage;

    int numberOfPopularItems7 = 7;
    int numberOfBestSellersItems7 = 7;
    String loginPageVerification = "AUTHENTICATION";
    
    @Test
    public void verifyNavigationToHomePage(){
        
    homePage = new HomePage(driver);

    homePage.baseURL();
    }

    @Test
    public void checkNumberOfPopularItems(){

    homePage = new HomePage(driver);

    homePage.baseURL();
    homePage.clickOnPopularButton();
    homePage.validateNumberOfPopularItems(numberOfPopularItems7);
    }

   @Test
    public void checkNumberOfBestSellersItems(){

    homePage = new HomePage(driver);

    homePage.baseURL();
    homePage.clickOnBestSellersButton();
    homePage.validateNumberOfBestSellersItems(numberOfBestSellersItems7);
    }

    @Test
    public void checkSignin(){

    homePage = new HomePage(driver);
    loginPage = new LoginPage(driver);

    homePage.baseURL();
    homePage.clickOnSignInButton();
    loginPage.verifyLoginPage(loginPageVerification);

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}


    
}
