package tests;

import hooks.BaseClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.ListenerUtils;
import utils.Utils;

@Listeners(ListenerUtils.class)
public class TestPractices extends Utils {

    @Test(enabled = true)
    public void practicesTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver.get());
        CommonPage commonPage = new CommonPage(driver.get());
        PlayerPage playerPage = new PlayerPage(driver.get());
        CultivandoHabitoPage cultivandoHabitoPage = new CultivandoHabitoPage(driver.get());
        CaminhoPage caminhoPage = new CaminhoPage(driver.get());
        FundamentoPage fundamentoPage = new FundamentoPage(driver.get());
        CongratsPage congratsPage = new CongratsPage(driver.get());
        LoginPage login = new LoginPage(driver.get());
        IntroductionPage introductionPage = new IntroductionPage(driver.get());

        introductionPage.onboarding();
        login.login(LoginPage.emailPremium);

        homePage.scrollToInstagramCard();
        homePage.scrollToCultivandoHabito();

        homePage.enterOnCultivandoHabito();
        cultivandoHabitoPage.enterDay1();
        cultivandoHabitoPage.startPratice();

        playerPage.closePalyer();
        commonPage.backToHome();

        Thread.sleep(2000);
        if (BaseClass.platform_run.equalsIgnoreCase("android")) {
            Utils.scroll("down");
        }

        homePage.enterOnCaminho();
        caminhoPage.enterDay1();
        caminhoPage.playAudio1();
        commonPage.startPratice();

        playerPage.closePalyer();
        commonPage.backToHome();

        Thread.sleep(2000);
        homePage.scrollToFundamentos();
        homePage.enterOnFundamentos();

        fundamentoPage.scrollScreenFundamentos();

        fundamentoPage.enterDay1();
        fundamentoPage.playAudio1();
        fundamentoPage.startPratice();

        fundamentoPage.skipAudio();
        congratsPage.finishPratice();
    }
}
