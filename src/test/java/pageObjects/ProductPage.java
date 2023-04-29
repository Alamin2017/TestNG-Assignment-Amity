package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.ElementActions;


import static org.junit.Assert.assertTrue;

public class ProductPage {
    //tc_002 locators
    public static By username = By.xpath("//input[@placeholder='Username']");

    public static void enterUsername(String user) throws InterruptedException {
        ElementActions.doEnterValue(username, user);
    }

    public static By password = By.xpath("//input[@placeholder='Password']");

    public static void enterPassword(String pass) throws InterruptedException {
        ElementActions.doEnterValue(password, pass);
    }

    public static By loginButton = By.xpath("//button[normalize-space()='Login']");

    public static void clickLoginButton() throws InterruptedException {
        ElementActions.click_Element(loginButton);
    }

    public static By Admin = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span");

    public static void clickAdmin() throws InterruptedException {
        ElementActions.click_Element(Admin);
    }

    public static By Job = By.xpath("//span[normalize-space()='Job']");

    public static void clickJob() throws InterruptedException {
        ElementActions.click_Element(Job);
    }

    public static By payGrade = By.xpath("//a[normalize-space()='Pay Grades']");

    public static void clickPayGrade() throws InterruptedException {
        ElementActions.click_Element(payGrade);
    }

    public static By plusAdd = By.xpath("//button[normalize-space()='Add']");

    public static void clickPlusAdd() throws InterruptedException {
        ElementActions.click_Element(plusAdd);
    }

    public static By inputField = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");

    public static void enterInputField(String name_i) throws InterruptedException {
        ElementActions.doEnterValue(inputField, name_i);
    }

    public static By saveButton = By.xpath("//button[normalize-space()='Save']");

    public static void clickSaveButton() throws InterruptedException {
        ElementActions.click_Element(saveButton);
    }

    public static By currencyAddButton = By.xpath("//button[normalize-space()='Add']");

    public static void clickCurrencyAddButton() throws InterruptedException {
        ElementActions.click_Element(currencyAddButton);
    }

    public static By dropDown = By.xpath("//div[@class='oxd-select-text-input']");

    public static void clickDropDownAndIndianRupee() throws InterruptedException {
        ElementActions.click_Element(dropDown);
        WebElement drp=ElementActions.getElement(dropDown);
        for(int i=1;i<59;i++)
        {
            drp.sendKeys(Keys.DOWN);
        }
        drp.sendKeys(Keys.ENTER);
    }
    public static By minSalary = By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]/div[1]/div[2]/input[1]");
    public static By maxSalary = By.xpath("//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//input[1]");

    public static void enterMinSalary(String min_s) throws InterruptedException {
        ElementActions.doEnterValue(minSalary,min_s);
    }
    public static void enterMaxSalary(String max_s) throws InterruptedException {
        ElementActions.doEnterValue(maxSalary,max_s);
    }
    public static By save2=By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-actions']/button[2]");

    public static void clickCurSaveButton() throws InterruptedException {
        ElementActions.click_Element(save2);
    }

    public static By record_IR=By.xpath("//div[contains(text(),'Indian Rupee')]");
    public static void IRAssertion() throws InterruptedException {
        ElementActions.doDisplayed(record_IR);
    }


    // tc_001_locators
    public static By PIM=By.xpath("//span[normalize-space()='PIM']");

    public static void clickPIM() throws InterruptedException {
        ElementActions.click_Element(PIM);
    }
    public static By textFiledEmployeeName=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input");

    public static void enterEmployeeName(String key) throws InterruptedException {
        ElementActions.doEnterValue(textFiledEmployeeName,key);
    }

    public static By searchButton=By.xpath("//button[normalize-space()='Search']");
    public static void clickSearchButton() throws InterruptedException {
        ElementActions.click_Element(searchButton);
    }

    public static By ch1=By.xpath("//div[contains(text(),'cha ')]");
    public static By ch2=By.xpath("//div[contains(text(),'Chenzira ')]");
    public static By ch3=By.xpath("//div[contains(text(),'Chase')]");

    public static void assertion_fName_lName_record_table() throws InterruptedException {
        String ch1_assert=ElementActions.get_text_Element(ch1);
        String ch1_assert_lower=ch1_assert.toLowerCase();
        System.out.println(ch1_assert_lower);
        assertTrue(ch1_assert_lower.contains("ch"));

        String ch2_assert=ElementActions.get_text_Element(ch2);
        String ch2_assert_lower=ch2_assert.toLowerCase();
        System.out.println(ch2_assert_lower);
        assertTrue(ch2_assert_lower.contains("ch"));

        String ch3_assert=ElementActions.get_text_Element(ch3);
        String ch3_assert_lower=ch3_assert.toLowerCase();
        System.out.println(ch3_assert_lower);
        assertTrue(ch3_assert_lower.contains("ch"));
    }







}
