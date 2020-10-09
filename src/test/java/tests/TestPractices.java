package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import hooks.BaseClass;
import utils.ListenerUtils;
import hooks.PageFactory;
import utils.Utils;

@Listeners(ListenerUtils.class)
public class TestPractices extends Utils {

    @Test(enabled = true)
    public void practicesTest() throws InterruptedException {

        PageFactory.initPages();

        clickOn(IntroductionPage.btSkip);
        clickOn(CreateAccountPage.idBtnToLogin);

        LoginPage.doLoginEmail();

        Utils.scrollToElement("down long", PracticesPage.cardInstagram);

        Utils.scrollToElement("up long", PracticesPage.textCultivandoHabitoPT);
        clickOn(PracticesPage.textCultivandoHabitoPT);

//        Utils.scrollToElement("down long", CultivandoHabitoPage.textCultivandoHabitoDayOne);
        clickOn(CultivandoHabitoPage.textCultivandoHabitoDayOne);
        clickOn(CultivandoHabitoPage.startPractice);

        PlayerPage.closePalyer();

        clickOn(CommonPage.idCloseBtn);

        Thread.sleep(2000);
        Utils.scroll("down");
        clickOn(PracticesPage.textCaminhoPT);

        clickOn(CaminhoPage.idDayOne);
        clickOn(CaminhoPage.idDayPlay1);
        clickOn(CommonPage.idstartPracticePremmium);

        PlayerPage.closePalyer();

        clickOn(CommonPage.idCloseBtn);
        clickOn(CommonPage.idCloseBtn);

        Thread.sleep(2000);
        Utils.scrollToElement("down long", PracticesPage.textFundamentosPT);
        clickOn(PracticesPage.textFundamentosPT);

        FundamentoPage.scrollScreenFundamentos();

        clickOn(FundamentoPage.idDayOne);
        clickOn(FundamentoPage.idDayPlay1);
        clickOn(FundamentoPage.idstartPracticePremmium);

        FundamentoPage.skipAudio();
        clickOn(CongratsPage.idBtnCancel);
    }
}
