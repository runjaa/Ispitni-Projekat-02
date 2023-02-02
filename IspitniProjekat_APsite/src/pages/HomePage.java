package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super (driver);
    }

    By popularButtonBy = By.xpath("//*[@id='home-page-tabs']/li[1]/a");
    By bestSellersButtonBy = By.xpath("//*[@id='home-page-tabs']/li[2]/a");
    By popularItemsBy = By.xpath("//*[@id='homefeatured']/li");
    By bestSellersBy = By.xpath("//*[@id='blockbestsellers']/li");
    By signInButtonBy = By.xpath("//*[@class='login']");
    By authenticationLabelBy = By.xpath("//*[@id='center_column']/h1");

    String baseURL = "http://automationpractice.com/index.php";

    public HomePage baseURL(){
        driver.get(baseURL);
        return this;
    }

    public HomePage clickOnPopularButton(){
        click(popularButtonBy);
        return this;
    }

    public HomePage validateNumberOfPopularItems(int numberOfAllItems){
        int actualNumberOfProducts = locateElements(popularItemsBy).size();
        System.out.println(actualNumberOfProducts);
        assertIntegerEquals(numberOfAllItems, actualNumberOfProducts);
        return this;
    }

    public HomePage clickOnBestSellersButton(){
        click(bestSellersButtonBy);
        return this;
    }

   public HomePage validateNumberOfBestSellersItems(int numberOfAllItems){
        int actualNumberOfProducts = locateElements(bestSellersBy).size();
        System.out.println(actualNumberOfProducts + "pass");
        assertIntegerEquals(numberOfAllItems, actualNumberOfProducts);
        return this;
    }

    public HomePage clickOnSignInButton(){
        click(signInButtonBy);
        return this;
    }

    

    

    

    
}
