package base;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    // This class can be used to set up and tear down the WebDriver instance for tests
    @BeforeClass
    public void setUp() {
        // Code to initialize WebDriver and other setup tasks

        driver= new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://practicetestautomation.com/");
    }
    @AfterClass
    public void teardown(){
        if(driver!=null){
            driver.quit();
        }
    }

}
