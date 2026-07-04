package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticePage 
{
    WebDriver driver;
    public PracticePage(WebDriver driver){
        this.driver=driver;
    }

    private By testLoginPageButton=By.xpath("//a[text()='Test Login Page']");

    public void clickLoginPageLink()
    {
        driver.findElement(testLoginPageButton).click();
    }
    
    
}