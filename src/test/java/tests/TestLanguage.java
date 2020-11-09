package tests;

import org.testng.annotations.Test;
import pages.IntroductionPage;
import pages.LoginPage;
import utils.Utils;

public class TestLanguage extends Utils {

    @Test(enabled = true)
    public void langPortuguesTest() {
        IntroductionPage introductionPage = new IntroductionPage(driver.get());
        LoginPage loginPage = new LoginPage(driver.get());

        introductionPage.language_portuguese();
        introductionPage.continue_to_login_pt();
        loginPage.checkLanguagePT();
    }

    @Test(enabled = true)
    public void langEspanishTest() {
        IntroductionPage introductionPage = new IntroductionPage(driver.get());
        LoginPage loginPage = new LoginPage(driver.get());

        introductionPage.language_spanish();
        introductionPage.continue_to_login_es();
        loginPage.checkLanguageES();
    }
}
