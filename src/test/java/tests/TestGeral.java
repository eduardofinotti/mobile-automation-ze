package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.ListenerUtils;
import hooks.PageFactory;
import utils.Utils;


@Listeners(ListenerUtils.class)
public class TestGeral extends Utils {

    @Test(enabled = true)
    public void testGeral() throws InterruptedException {
        PageFactory.initPages();

        clickOn(IntroductionPage.btSkip);

        clickOn(CreateAccountPage.idBtnToLogin);

        LoginPage.doLoginEmail();

        Utils.scrollToElement("down long", PracticesPage.cardInstagram);
        clickOn(MainPage.idBtnInsight);

        Utils.scrollToElement("down long", InsightPage.textFinalVideo);
        Utils.scrollToElement("up long", InsightPage.textTopVideo);
        clickOn(InsightPage.textArtigos);

        Utils.scrollToElement("down long", InsightPage.textFinalArtigos);
        Utils.scrollToElement("up long", InsightPage.textTopArtigos);
        clickOn(InsightPage.textCitacoes);

        Utils.scrollToElement("down long", InsightPage.textFinalCitacoes);
        Utils.scrollToElement("up long", InsightPage.textTopCitacoes);
    }
}
