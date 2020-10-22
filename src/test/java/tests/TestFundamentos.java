package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class TestFundamentos extends Utils {

    @Test(enabled = true)
    public void fundamentosTest() throws InterruptedException {

        IntroductionPage introductionPage = new IntroductionPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        PracticesPage practicesPage = new PracticesPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        FundamentoPage fundamentoPage = new FundamentoPage(driver);
        CongratsPage congratsPage = new CongratsPage(driver);
        LanguagePage languagePage = new LanguagePage(driver);

        if (Utils.isElementDisplayed(languagePage.idBtnPortuguese)) {
            clickOn(languagePage.idBtnPortuguese);
        }

        clickOn(introductionPage.btSkip);
        clickOn(createAccountPage.idBtnToLogin);

        loginPage.doLoginEmail(LoginPage.emailPremium);

        if (isAndroid) {
            Utils.scrollToElement("down", practicesPage.textFundamentosPT);
        }
        clickOn(practicesPage.textFundamentosPT);

        fundamentoPage.scrollScreenFundamentos();

        clickOn(fundamentoPage.idDayOne);
        clickOn(fundamentoPage.idDayPlay1);
        clickOn(fundamentoPage.idstartPracticePremmium);

        fundamentoPage.skipAudio();

        clickOn(congratsPage.idBtnCancel);
    }
}
