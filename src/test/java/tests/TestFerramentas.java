package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class TestFerramentas extends Utils {

    @Test(enabled = true)
    public void ferramentasTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());
        HomePage homePage = new HomePage(driver.get());
        IntroductionPage introductionPage = new IntroductionPage(driver.get());

        introductionPage.onboarding();
        loginPage.login(LoginPage.emailPremium);
        homePage.enterToolsTab();

        takeScreenshotAndSave("ferramentas");
    }

}
