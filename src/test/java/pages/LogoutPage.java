package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    private final WebDriver driver;

    private By loginMessage=By.xpath("//p[contains(@class,'has-text-align-center')]");
    private By logoutButton=By.xpath("//*[contains(@class,'wp-block-button__link')]");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getLoginSuccessMessage()
    {
        System.out.println(driver.findElement(loginMessage).getText());
    }

    public void clickOnLogoutButton(){
        driver.findElement(logoutButton).click();
    }
}
