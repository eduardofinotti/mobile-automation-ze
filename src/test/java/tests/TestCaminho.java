package tests;

import org.testng.annotations.Test;
import pages.CaminhoPage;
import pages.HomePage;
import pages.IntroductionPage;
import pages.LoginPage;
import utils.Utils;

public class TestCaminho extends Utils {

    @Test(enabled = true)
    public void ferramentasTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());
        HomePage homePage = new HomePage(driver.get());
        IntroductionPage introductionPage = new IntroductionPage(driver.get());
        CaminhoPage caminhoPage = new CaminhoPage(driver.get());

        introductionPage.onboarding();
        loginPage.login(LoginPage.emailPremium);

        homePage.enterOnCaminho();
        caminhoPage.completeDay();
    }

}
