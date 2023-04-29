package testCases;
import Envpage.BaseEnv;
import org.testng.annotations.Test;
import pageObjects.ProductPage;

public class TestAmity extends BaseEnv {


    @Test(priority = 1)
    public void test_tc001_Verify_User_Can_Search_with_Partial_Text() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        ProductPage.enterUsername("Admin");
        Thread.sleep(2000);
        ProductPage.enterPassword("admin123");
        Thread.sleep(2000);
        ProductPage.clickLoginButton();
        Thread.sleep(2000);
        ProductPage.clickPIM();
        Thread.sleep(2000);
        ProductPage.enterEmployeeName("ch");
        Thread.sleep(5000);
        ProductPage.clickSearchButton();
        ProductPage.assertion_fName_lName_record_table();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void test_tc002_Verify_User_Can_Add_Pay_Grades() throws InterruptedException
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        ProductPage.enterUsername("Admin");
        Thread.sleep(2000);
        ProductPage.enterPassword("admin123");
        Thread.sleep(2000);
        ProductPage.clickLoginButton();
        Thread.sleep(2000);
        ProductPage.clickAdmin();
        Thread.sleep(2000);
        ProductPage.clickJob();
        Thread.sleep(2000);
        ProductPage.clickPayGrade();
        Thread.sleep(2000);
        ProductPage.clickPlusAdd();
        Thread.sleep(2000);
        ProductPage.enterInputField("Indian Rupee");
        Thread.sleep(2000);
        ProductPage.clickSaveButton();
        Thread.sleep(2000);
        ProductPage.clickCurrencyAddButton();
        Thread.sleep(2000);
        ProductPage.clickDropDownAndIndianRupee();
        Thread.sleep(2000);
        ProductPage.enterMinSalary("30000");
        Thread.sleep(2000);
        ProductPage.enterMaxSalary("100000");
        Thread.sleep(2000);
        ProductPage.clickCurSaveButton();
        Thread.sleep(5000);
        ProductPage.IRAssertion();



    }
}
