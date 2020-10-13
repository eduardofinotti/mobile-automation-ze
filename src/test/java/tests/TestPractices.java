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
        IntroductionPage introductionPage = new IntroductionPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        PracticesPage practicesPage = new PracticesPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CommonPage commonPage = new CommonPage(driver);
        PlayerPage playerPage = new PlayerPage(driver);
        CultivandoHabitoPage cultivandoHabitoPage = new CultivandoHabitoPage(driver);
        CaminhoPage caminhoPage = new CaminhoPage(driver);
        FundamentoPage fundamentoPage = new FundamentoPage(driver);
        CongratsPage congratsPage = new CongratsPage(driver);
        LanguagePage languagePage = new LanguagePage(driver);

        if (Utils.isElementDisplayed(languagePage.idBtnPortuguese)) {
            clickOn(languagePage.idBtnPortuguese);
        }

        clickOn(introductionPage.btSkip);
        clickOn(createAccountPage.idBtnToLogin);

        loginPage.doLoginEmail();

        Utils.scrollToElement("down long", practicesPage.cardInstagram);

        Utils.scrollToElement("up long", practicesPage.textCultivandoHabitoPT);
        clickOn(practicesPage.textCultivandoHabitoPT);

//        Utils.scrollToElement("down long", CultivandoHabitoPage.textCultivandoHabitoDayOne);
        clickOn(cultivandoHabitoPage.textCultivandoHabitoDayOne);
        clickOn(cultivandoHabitoPage.startPractice);

        playerPage.closePalyer();

        clickOn(commonPage.idCloseBtn);

        Thread.sleep(2000);
        Utils.scroll("down");
        clickOn(practicesPage.textCaminhoPT);

        clickOn(caminhoPage.idDayOne);
        clickOn(caminhoPage.idDayPlay1);
        clickOn(commonPage.idstartPracticePremmium);

        playerPage.closePalyer();

        clickOn(commonPage.idCloseBtn);
        clickOn(commonPage.idCloseBtn);

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
