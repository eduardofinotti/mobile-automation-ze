package tests;

import org.testng.annotations.Test;
import pages.*;

public class TestGeral extends BaseClass{

    @Test(enabled = false)
    public void testGeral(){
        IntroductionPage.clickSkip();
        CreateAccountPage.clickToLogin();
        LoginPage.enterEmail();
        LoginPage.enterPassword();
        LoginPage.clickLogin();
        PracticesPage.scrollToBottom();
        MainPage.clickInsight();
        InsightPage.scrollToBottomVideos();
        InsightPage.scrollToTopVideos();
        InsightPage.clickArtigos();
        InsightPage.scrollToBottomArtigos();
        InsightPage.scrollToTopArtigos();
        InsightPage.clickCitacoes();
        InsightPage.scrollToBottomCitacoes();
        InsightPage.scrollToTopCitacoes();
    }
}
