package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Add methods to interact with the login page elements
    private By usernameField=By.id("username");
    private By passwordField=By.id("password");
    private By loginButton=By.id("submit");

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


    
}
