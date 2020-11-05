package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.ListenerUtils;
import utils.Utils;

@Listeners(ListenerUtils.class)
public class TestGeral extends Utils {

    @Test(enabled = true)
    public void testGeral() throws InterruptedException {

        IntroductionPage introductionPage = new IntroductionPage(driver.get());
        CreateAccountPage createAccountPage = new CreateAccountPage(driver.get());
        PracticesPage practicesPage = new PracticesPage(driver.get());
        LoginPage loginPage = new LoginPage(driver.get());
        MainPage mainPage = new MainPage(driver.get());
        InsightPage insightPage = new InsightPage(driver.get());
        LanguagePage languagePage = new LanguagePage(driver.get());

        if (Utils.isElementDisplayed(languagePage.idBtnPortuguese)) {
            clickOn(languagePage.idBtnPortuguese);
        }

        clickOn(introductionPage.btSkip);
        clickOn(createAccountPage.idBtnToLogin);

        loginPage.doLoginEmail(LoginPage.emailPremium);

        Utils.scrollToElement("down long", practicesPage.cardInstagram);
        clickOn(mainPage.idBtnInsight);

        Utils.scrollToElement("down long", insightPage.textFinalVideo);
        Utils.scrollToElement("up long", insightPage.textTopVideo);
        clickOn(insightPage.textArtigos);

        Utils.scrollToElement("down long", insightPage.textFinalArtigos);
        Utils.scrollToElement("up long", insightPage.textTopArtigos);
        clickOn(insightPage.textCitacoes);

        Utils.scrollToElement("down long", insightPage.textFinalCitacoes);
        Utils.scrollToElement("up long", insightPage.textTopCitacoes);
    }
}
