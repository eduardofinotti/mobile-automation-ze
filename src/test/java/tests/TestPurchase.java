package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.ListenerUtils;
import utils.Utils;

@Listeners(ListenerUtils.class)
public class TestPurchase extends Utils {

    @Test(enabled = false)
    public void purchaseTest() throws InterruptedException {
        CommonPage commonPage = new CommonPage(driver.get());
        MenuPage menuPage = new MenuPage(driver.get());
        PurchasePage purchasePage = new PurchasePage(driver.get());
        IntroductionPage introductionPage = new IntroductionPage(driver.get());
        LoginPage loginPage = new LoginPage(driver.get());

        introductionPage.onboarding();
        loginPage.login(LoginPage.email);

        clickOn(menuPage.txt_purchase);
        clickOn(purchasePage.idActiveAds);

        clickOn(purchasePage.idOption1);

        clickOn(commonPage.btn_next);
        clickOn(commonPage.btn_back);

        clickOn(purchasePage.idOption2);

        clickOn(commonPage.btn_next);
        clickOn(commonPage.btn_back);

        clickOn(purchasePage.idOption3);

        clickOn(commonPage.btn_next);
        clickOn(commonPage.btn_back);

        clickOn(purchasePage.idOption4);

        clickOn(commonPage.btn_next);
        clickOn(commonPage.btn_back);

        clickOn(purchasePage.idOption5);

        clickOn(commonPage.btn_next);
        clickOn(commonPage.btn_back);
    }

}
