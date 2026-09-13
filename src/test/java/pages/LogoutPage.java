package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutPage {
    private final WebDriver driver;

    private By loginMessage=By.xpath("//p[contains(@class,'has-text-align-center')]");
    private By logoutButton=By.xpath("//a[normalize-space()='Log out']");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

        public void verifyLoginSuccessPage()
    { 
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"),
            "The login success URL was not displayed");

        String message = driver.findElement(loginMessage).getText().toLowerCase();
        Assert.assertTrue(message.contains("congratulations") || message.contains("successfully logged in"),
            "The login success message was not displayed");
        Assert.assertTrue(driver.findElement(logoutButton).isDisplayed(),
            "The Log out button was not displayed");
    }

    public void clickOnLogoutButton(){
        driver.findElement(logoutButton).click();
    }
}
