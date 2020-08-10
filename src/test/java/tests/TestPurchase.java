package tests;

import org.testng.annotations.Test;
import pages.*;

public class TestPurchase extends BaseClass{

    @Test(enabled = true)
    public void purchaseTest(){
        LanguagePage.clickPortuguese();
        IntroductionPage.clickSkip();
        CreateAccountPage.clickToLogin();
        LoginPage.enterEmail();
        LoginPage.enterPassword();
        LoginPage.clickLogin();
        MainPage.clickMenu();
        MenuPage.clickPurchase();
        PurchasePage.clickBtnAds();
        PurchasePage.clickOption1();
        PurchasePage.clickNext();
        PurchasePage.backPage();
        PurchasePage.clickOption2();
        PurchasePage.clickNext();
        PurchasePage.backPage();
        PurchasePage.clickOption3();
        PurchasePage.clickNext();
        PurchasePage.backPage();
        PurchasePage.clickOption4();
        PurchasePage.clickNext();
        PurchasePage.backPage();
        PurchasePage.clickOption5();
        PurchasePage.clickNext();
        PurchasePage.backPage();
    }

}
