package tests;

import hooks.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.ListenerUtils;
import utils.Utils;

@Listeners(ListenerUtils.class)
public class TestPurchase extends Utils {

    @Test(enabled = true)
    public void purchaseTest() throws InterruptedException {

        PageFactory.initPages();

        if (Utils.isElementDisplayed(LanguagePage.idBtnPortuguese)) {
            clickOn(LanguagePage.idBtnPortuguese);
        }

        clickOn(IntroductionPage.btSkip);
        clickOn(CreateAccountPage.idBtnToLogin);

        LoginPage.doLoginEmail();

        clickOn(MenuPage.textMenuPurchase);
        clickOn(MenuPage.textMenuPurchase);
        clickOn(PurchasePage.idActiveAds);

        clickOn(PurchasePage.idOption1);

        clickOn(CommonPage.idBtnNext);
        clickOn(CommonPage.idBtnBack);

        clickOn(PurchasePage.idOption2);

        clickOn(CommonPage.idBtnNext);
        clickOn(CommonPage.idBtnBack);

        clickOn(PurchasePage.idOption3);

        clickOn(CommonPage.idBtnNext);
        clickOn(CommonPage.idBtnBack);

        clickOn(PurchasePage.idOption4);

        clickOn(CommonPage.idBtnNext);
        clickOn(CommonPage.idBtnBack);

        clickOn(PurchasePage.idOption5);

        clickOn(CommonPage.idBtnNext);
        clickOn(CommonPage.idBtnBack);
    }

}
