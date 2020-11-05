package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class TestFerramentas extends Utils {

    @Test(enabled = true)
    public void ferramentasTest() throws InterruptedException {
        IntroductionPage introductionPage = new IntroductionPage(driver.get());
        CreateAccountPage createAccountPage = new CreateAccountPage(driver.get());
        LoginPage loginPage = new LoginPage(driver.get());
        MainPage mainPage = new MainPage(driver.get());
        LanguagePage languagePage = new LanguagePage(driver.get());

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
