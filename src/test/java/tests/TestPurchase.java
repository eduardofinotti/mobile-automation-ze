package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.ListenerUtils;
import utils.Utils;

@Listeners(ListenerUtils.class)
public class TestPurchase extends Utils {

    @Test(enabled = true)
    public void purchaseTest() throws InterruptedException {

//        PageFactory.initPages();
        IntroductionPage introductionPage = new IntroductionPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CommonPage commonPage = new CommonPage(driver);
        MenuPage menuPage = new MenuPage(driver);
        PurchasePage purchasePage = new PurchasePage(driver);
        LanguagePage languagePage = new LanguagePage(driver);

        if (Utils.isElementDisplayed(languagePage.idBtnPortuguese)) {
            clickOn(languagePage.idBtnPortuguese);
        }

        clickOn(introductionPage.btSkip);
        clickOn(createAccountPage.idBtnToLogin);

        loginPage.doLoginEmail();

        clickOn(menuPage.textMenuPurchase);
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
