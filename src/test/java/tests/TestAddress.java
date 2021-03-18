package tests;

import org.testng.annotations.Test;
import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;
import utils.Utils;

public class TestAddress extends Utils {

    @Test(enabled = true)
    public void register_address_as_guest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());

        loginPage.login_as_guest();
        loginPage.choose_18_years();
        loginPage.check_is_logged_guest();

        AddressPage addressPage = new AddressPage(driver.get());
        addressPage.chooseAddress();

        HomePage homePage = new HomePage(driver.get());
        homePage.checkAddressHome();
    }
}
