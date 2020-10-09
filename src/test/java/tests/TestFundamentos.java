package tests;

import hooks.PageFactory;
import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class TestFundamentos extends Utils {

    @Test(enabled = true)
    public void fundamentosTest() throws InterruptedException {

        PageFactory.initPages();

        clickOn(IntroductionPage.btSkip);
        clickOn(CreateAccountPage.idBtnToLogin);

        LoginPage.doLoginEmail();

        Utils.scrollToElement("down", PracticesPage.textFundamentosPT);
        clickOn(PracticesPage.textFundamentosPT);

        FundamentoPage.scrollScreenFundamentos();

        clickOn(FundamentoPage.idDayOne);
        clickOn(FundamentoPage.idDayPlay1);
        clickOn(FundamentoPage.idstartPracticePremmium);

        FundamentoPage.skipAudio();

        clickOn(CongratsPage.idBtnCancel);
    }
}
