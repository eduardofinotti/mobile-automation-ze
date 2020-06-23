package tests;

import org.testng.annotations.Test;
import pages.*;

public class TestFundamentos extends BaseClass{

    @Test
    public void fundamentosTest(){
        IntroductionPage.clickSkip();
        CreateAccountPage.clickToLogin();
        LoginPage.enterEmail();
        LoginPage.enterPassword();
        LoginPage.clickLogin();
        PracticesPage.scrollAndClickFundamentosPT();
        FundamentoPage.scrollScreenFundamentos();
        FundamentoPage.clickDayOneFundamentos();
        FundamentoPage.clickStartDayOneFundamentosPlay1();
        FundamentoPage.clickStartDayOneFundamentos();
        FundamentoPage.skipAudioDayOne1();
        FundamentoPage.finishPracticeFundamentos();
    }
}
