package tests;

import org.testng.annotations.Test;
import pages.*;

public class TestPractices extends BaseClass{

    @Test(enabled = false)
    public void practicesTest(){
        IntroductionPage.clickSkip();
        CreateAccountPage.clickToLogin();
        LoginPage.enterEmail();
        LoginPage.enterPassword();
        LoginPage.clickLogin();
        PracticesPage.scrollToBottom();
        PracticesPage.scrollAndClickCultivandoHabitoPT();
        CultivandoHabitoPage.clickDayOneCultivandoHabito();
        CultivandoHabitoPage.clickStartDayOneCultivandoHabito();
        CultivandoHabitoPage.closePlayerCultivandoHabito();
        CultivandoHabitoPage.closeCultivandoHabito();
        PracticesPage.scrollAndClickCaminhoPT();
        CaminhoPage.clickDayOneCaminho();
        CaminhoPage.clickStartDayOneCaminhoPlay1();
        CaminhoPage.clickStartDayOneCaminho();
        CaminhoPage.closePlayerCaminho();
        CaminhoPage.closeCaminho();
        CaminhoPage.closeCaminho();
        PracticesPage.scrollAndClickFundamentosPT();
        FundamentoPage.scrollScreenFundamentos();
        FundamentoPage.clickDayOneFundamentos();
        FundamentoPage.clickStartDayOneFundamentosPlay1();
        FundamentoPage.clickStartDayOneFundamentos();
        FundamentoPage.skipAudioDayOne1();
        FundamentoPage.finishPracticeFundamentos();
    }
}
