package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    By signOutButtonBy = By.xpath("//a[@title='Log me out']");

    public MyAccountPage clickSignOutButton(){
        click(signOutButtonBy);
    return this;}
    
}
