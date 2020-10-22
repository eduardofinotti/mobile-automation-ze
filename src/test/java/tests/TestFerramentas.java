package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class TestFerramentas extends Utils {

    @Test(enabled = true)
    public void ferramentasTest() throws InterruptedException {
        IntroductionPage introductionPage = new IntroductionPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = new MainPage(driver);
        LanguagePage languagePage = new LanguagePage(driver);

        if (Utils.isElementDisplayed(languagePage.idBtnPortuguese)) {
            clickOn(languagePage.idBtnPortuguese);
        }

        clickOn(introductionPage.btSkip);
        clickOn(createAccountPage.idBtnToLogin);

        loginPage.doLoginEmail(LoginPage.emailPremium);

        clickOn(mainPage.idBtnFerramentas);

        takeScreenshotAndSave();
    }

}
