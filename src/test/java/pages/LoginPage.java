package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.SeleniumWaits;

public class LoginPage {
WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Add methods to interact with the login page elements
    private By usernameField=By.id("username");
    private By passwordField=By.id("password");
    private By loginButton=By.id("submit");
    private By errorMessage=By.id("error");

    // Method to enter username
    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickOnSubmitButton(){
        driver.findElement(loginButton).click();
    }
    public void usernameLoginFailed(){
        SeleniumWaits.waitforelementtobevisiable(errorMessage,driver);
        WebElement error=driver.findElement(errorMessage);
        Assert.assertTrue(error.isDisplayed(),"Error message not displayed");
        Assert.assertEquals(error.getText(),"Your username is invalid!", "error message mismatch");
    }
    public void passwordFailedLogin() {
          SeleniumWaits.waitforelementtobevisiable(errorMessage,driver);
        WebElement pwdElement=driver.findElement(errorMessage);
        Assert.assertTrue(pwdElement.isDisplayed(),"Error message not displayed");
        Assert.assertEquals(pwdElement.getText(),"Your password is invalid!","error meassge not same ");
        
    }



    
}
