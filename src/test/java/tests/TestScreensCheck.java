package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class TestScreensCheck extends Utils {

    @Test(enabled = true)
    public void screensCheck() throws InterruptedException {
        IntroductionPage introductionPage = new IntroductionPage(driver.get());
        LoginPage loginPage = new LoginPage(driver.get());
        HomePage homePage = new HomePage(driver.get());
        CommonPage commonPage = new CommonPage(driver.get());
        OptionsPage optionsPage = new OptionsPage(driver.get());

        introductionPage.onboarding();
        loginPage.login(LoginPage.emailPremium);

        homePage.scrollToFundamentos();

        homePage.enterOnCaminho();
        Utils.takeScreenshotAndSave("caminho");
        commonPage.backToHome();

        Utils.scroll("down");

        homePage.enterOnFundamentos();
        Utils.takeScreenshotAndSave("fundamentos");
        commonPage.backToHome();

        Utils.scroll("down long");
//        homePage.scrollToAcolhendoAnsiedade();

        homePage.enterAcolhendoAnsiedade();
        Utils.takeScreenshotAndSave("acolhendo ansiedade");
        commonPage.backToHome();

        homePage.scrollToProgramaMinfulness();

        homePage.enterProgramaMindfulness();
        Utils.takeScreenshotAndSave("mindfuless");
        commonPage.backToHome();

        homePage.enterMoreTab();
        optionsPage.enterOnDiarioDaGratidao();
        Utils.takeScreenshotAndSave("diario da gratidão");

    }
}
