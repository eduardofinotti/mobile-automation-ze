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
        LoginPage loginPage = new LoginPage(driver.get());
        InsightPage insightPage = new InsightPage(driver.get());
        HomePage homePage = new HomePage(driver.get());

        introductionPage.onboarding();
        loginPage.login(LoginPage.emailPremium);

        homePage.scrollToInstagramCard();
        homePage.enterInsightTab();

        insightPage.scrollToFinalVideoTab();
        insightPage.scrollToTopVideoTab();

        insightPage.enterArtigosTab();
        insightPage.scrollToFinalArtigosTab();
        insightPage.scrollToTopArtigosTab();

        insightPage.enterCitacoesTab();
        insightPage.scrollToFinalCitacoesTab();
        insightPage.scrollToTopCitacoesTab();
    }
}
