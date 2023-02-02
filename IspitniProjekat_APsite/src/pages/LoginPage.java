package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By authenticationLabelBy = By.xpath("//*[@id='center_column']/h1");
    By emailFieldBy = By.xpath("//*[@id='email']");
    By passwordFieldBy = By.xpath("//*[@id='passwd']");
    By signInButton2By = By.xpath("//*[@id='SubmitLogin']/span");
    By myAccountLabelBy = By.xpath("//*[@id='center_column']/h1");



    public LoginPage verifyLoginPage(String expectedLabel){
        String actualLabel = readText (authenticationLabelBy);
        assertTextEquals(actualLabel, expectedLabel);
        return this;
    }

    public LoginPage login(String email, String password){
       writeText(emailFieldBy, email);
       writeText(passwordFieldBy, password);
       click(signInButton2By);
       return this;
    }

    public LoginPage verifyLogin(String expectedLabel){
        String actualLabel = readText (myAccountLabelBy);
        assertTextEquals(actualLabel, expectedLabel);
        return this;
    }

    public LoginPage verifySignOut(String expectedLabel){
        String actualLabel = readText (myAccountLabelBy);
        assertTextEquals(actualLabel, expectedLabel);
        return this;}
        
    }
