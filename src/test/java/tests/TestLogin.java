package tests;

import org.testng.annotations.Test;
import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;
import utils.Utils;

public class TestLogin extends Utils {

    @Test(enabled = true)
    public void do_login_whith_success() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());
        loginPage.login();
    }

    @Test(enabled = true)
    public void login_guest_more_18_year() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());

        loginPage.login_as_guest();
        loginPage.choose_18_years();
        loginPage.check_is_logged_guest();
    }
}
