package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class TestOrder extends Utils {

    @Test(enabled = true)
    public void do_order_whith_success() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());
        AddressPage addressPage = new AddressPage(driver.get());
        HomePage homePage = new HomePage(driver.get());
        ProductPage productPage = new ProductPage(driver.get());
        CheckoutPage checkoutPage = new CheckoutPage(driver.get());

        loginPage.login();
        addressPage.chooseAddress();

        homePage.checkHome();
        homePage.accessSearchProducts();

        homePage.searchProduct();
        productPage.addProductQuantity();
        productPage.addInBag();

        checkoutPage.selectPaymentForm();
        checkoutPage.selectMoney();
        checkoutPage.selectWithoutChange();
        checkoutPage.finishOrder();
        checkoutPage.confirmOrder();
    }
}
