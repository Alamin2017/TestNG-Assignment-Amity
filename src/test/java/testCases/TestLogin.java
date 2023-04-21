package testCases;

import Envpage.BaseEnv;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TestLogin extends BaseEnv {

    @Test
    public void LoginTest() throws InterruptedException {
        driver.get("https://admin-demo.nopcommerce.com/");
        LoginPage lp=new LoginPage(driver);
        lp.setUserName("admin@yourstore.com");
        lp.setPassword("admin");
        lp.clickLogin();
        lp.clickLogout();
    }

}
