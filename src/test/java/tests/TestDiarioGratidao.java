package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class TestDiarioGratidao extends Utils {

    @Test(enabled = true)
    public void ferramentasTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());
        HomePage homePage = new HomePage(driver.get());
        IntroductionPage introductionPage = new IntroductionPage(driver.get());
        OptionsPage optionsPage = new OptionsPage(driver.get());
        DiarioGratidaoPage diarioGratidaoPage = new DiarioGratidaoPage(driver.get());

        introductionPage.onboarding();
        loginPage.login(LoginPage.emailPremium);
        homePage.enterMoreTab();
        optionsPage.enterOnDiarioDaGratidao();
        diarioGratidaoPage.cleanDiarioGratidao();
        diarioGratidaoPage.enterCreatePost();
        diarioGratidaoPage.writePost();
        diarioGratidaoPage.savePost();
        diarioGratidaoPage.checkDiarioGratidao();

        takeScreenshotAndSave("Diario Gratidao");
    }

}
