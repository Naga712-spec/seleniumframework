package tests;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.PracticePage;
import utils.ExcelUtils;

import org.testng.annotations.*;

public class LoginTest extends BaseTest{

@Test(dataProvider = "LoginData")
public void testLogin(String username,String password)
{
    HomePage homepage=new HomePage(driver);
    homepage.clickPracticeButton();
    PracticePage practicepage=new PracticePage(driver);
    practicepage.clickLoginPageLink();
    LoginPage loginpage=new LoginPage(driver);
    loginpage.enterUsername(username);
    loginpage.enterPassword(password);
    loginpage.clickOnSubmitButton();
    LogoutPage logoutpage=new LogoutPage(driver);
    logoutpage.getLoginSuccessMessage();
    logoutpage.clickOnLogoutButton();
    System.out.println("Test executed with: " + username + " / " + password);
}

@DataProvider(name="LoginData")
public Object[][] getData() throws Exception
{
        String path = "src/test/java/resources/testdata.xlsx";
        String sheetName = "DriverSheet";
        ExcelUtils.setExcelFile(path, sheetName);

        int rowCount = ExcelUtils.getRowCount(sheetName);
        Object[][] data = new Object[rowCount][2];
        for (int i = 0; i < rowCount; i++) {
            data[i][0] = ExcelUtils.getCellData(i, 0, sheetName); // username
            data[i][1] = ExcelUtils.getCellData(i, 1, sheetName); // password
        }
        return data;
}

}