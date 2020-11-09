package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class TestFundamentos extends Utils {

    @Test(enabled = true)
    public void fundamentosTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver.get());
        HomePage homePage = new HomePage(driver.get());
        FundamentoPage fundamentoPage = new FundamentoPage(driver.get());
        CongratsPage congratsPage = new CongratsPage(driver.get());
        IntroductionPage introductionPage = new IntroductionPage(driver.get());

        introductionPage.onboarding();
        loginPage.login(LoginPage.emailPremium);

        if (System.getProperty("platform").equalsIgnoreCase("android" )) {
            Utils.scrollToElement("down", homePage.txt_fundamentos);
        }

        homePage.enterOnFundamentos();
        fundamentoPage.scrollScreenFundamentos();

        fundamentoPage.enterDay1();
        fundamentoPage.playAudio1();
        fundamentoPage.startPratice();

        fundamentoPage.skipAudio();
        congratsPage.finishPratice();
    }
}
