package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.ListenerUtils;
import utils.Utils;

@Listeners(ListenerUtils.class)
public class TestPractices extends Utils {

    @Test(enabled = true)
    public void practicesTest() throws InterruptedException {
        IntroductionPage introductionPage = new IntroductionPage(driver.get());
        CreateAccountPage createAccountPage = new CreateAccountPage(driver.get());
        PracticesPage practicesPage = new PracticesPage(driver.get());
        LoginPage loginPage = new LoginPage(driver.get());
        CommonPage commonPage = new CommonPage(driver.get());
        PlayerPage playerPage = new PlayerPage(driver.get());
        CultivandoHabitoPage cultivandoHabitoPage = new CultivandoHabitoPage(driver.get());
        CaminhoPage caminhoPage = new CaminhoPage(driver.get());
        FundamentoPage fundamentoPage = new FundamentoPage(driver.get());
        CongratsPage congratsPage = new CongratsPage(driver.get());
        LanguagePage languagePage = new LanguagePage(driver.get());

        if (Utils.isElementDisplayed(languagePage.idBtnPortuguese)) {
            clickOn(languagePage.idBtnPortuguese);
        }

        clickOn(introductionPage.btSkip);
        clickOn(createAccountPage.idBtnToLogin);

        loginPage.doLoginEmail(LoginPage.emailPremium);

//        Utils.scrollToElement("down long", practicesPage.cardInstagram);  
//        Utils.scrollToElement("up long", practicesPage.textCultivandoHabitoPT);

        clickOn(practicesPage.textCultivandoHabitoPT);

//        Utils.scrollToElement("down long", CultivandoHabitoPage.textCultivandoHabitoDayOne);
        clickOn(cultivandoHabitoPage.textCultivandoHabitoDayOne);
        clickOn(cultivandoHabitoPage.startPractice);

        playerPage.closePalyer();

        Thread.sleep(2000);
        if(isAndroid){
            clickOn(commonPage.idCloseBtn);
        }else{
            Utils.backScreenIOS();
        }

        Thread.sleep(2000);
        if(isAndroid){
            Utils.scroll("down");
        }

        clickOn(practicesPage.textCaminhoPT);

        clickOn(caminhoPage.idDayOne);
        clickOn(caminhoPage.idDayPlay1);
        clickOn(commonPage.idstartPracticePremmium);

        playerPage.closePalyer();

        if(isAndroid){
            clickOn(commonPage.idCloseBtn);
        } else {
            Thread.sleep(1000);
            Utils.backScreenIOS();
            Thread.sleep(1000);
            Utils.backScreenIOS();
        }

        Thread.sleep(2000);
        Utils.scrollToElement("down long", practicesPage.textFundamentosPT);
        clickOn(practicesPage.textFundamentosPT);

        fundamentoPage.scrollScreenFundamentos();

        clickOn(fundamentoPage.idDayOne);
        clickOn(fundamentoPage.idDayPlay1);
        clickOn(fundamentoPage.idstartPracticePremmium);

        fundamentoPage.skipAudio();
        clickOn(congratsPage.idBtnCancel);
    }
}
