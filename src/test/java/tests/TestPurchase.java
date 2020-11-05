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
        IntroductionPage introductionPage = new IntroductionPage(driver.get());
        CreateAccountPage createAccountPage = new CreateAccountPage(driver.get());
        LoginPage loginPage = new LoginPage(driver.get());
        CommonPage commonPage = new CommonPage(driver.get());
        MenuPage menuPage = new MenuPage(driver.get());
        PurchasePage purchasePage = new PurchasePage(driver.get());
        LanguagePage languagePage = new LanguagePage(driver.get());

        if (Utils.isElementDisplayed(languagePage.idBtnPortuguese)) {
            clickOn(languagePage.idBtnPortuguese);
        }

        clickOn(introductionPage.btSkip);
        clickOn(createAccountPage.idBtnToLogin);

        loginPage.doLoginEmail(LoginPage.email);

        clickOn(menuPage.textMenuPurchase);
        clickOn(purchasePage.idActiveAds);

        clickOn(purchasePage.idOption1);

        clickOn(commonPage.idBtnNext);
        clickOn(commonPage.idBtnBack);

        clickOn(purchasePage.idOption2);

        clickOn(commonPage.idBtnNext);
        clickOn(commonPage.idBtnBack);

        clickOn(purchasePage.idOption3);

        clickOn(commonPage.idBtnNext);
        clickOn(commonPage.idBtnBack);

        clickOn(purchasePage.idOption4);

        clickOn(commonPage.idBtnNext);
        clickOn(commonPage.idBtnBack);

        clickOn(purchasePage.idOption5);

        clickOn(commonPage.idBtnNext);
        clickOn(commonPage.idBtnBack);
    }

}
