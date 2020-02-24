/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import Pages.InputPages.ILogLevel;
import Pages.InputPages.TestCore;
import Pages.LoginPage;
import org.testng.annotations.Test;

/**
 *
 * @author codeu
 */
public class FifthScenario extends TestCore {

    @Test
    public void fifthScenario() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        log("Test Started [Fifth Scenario Test] test", ILogLevel.TESTCASE);
        loginPage.clickOnSkipButton();
        loginPage.clickLogin();
        loginPage.enterEmail1();
        loginPage.enterPassword1();
        loginPage.clickEnter();
        loginPage.scrollTo();
        loginPage.clickInSight();
        loginPage.scrollTo();
        loginPage.clickArtigos();
        loginPage.scrollTo();
        loginPage.clickCitacoes();
        loginPage.scrollTo();
        loginPage.clickPraticas();
        loginPage.scrollTo();
        loginPage.clickFundamentos();
        loginPage.scrollScreen();
        loginPage.scrollOneFunamentos();
        loginPage.clickDay1();
        loginPage.clickDay1Audio1();
        loginPage.iniciar();
        log("Test Completed Successfully", ILogLevel.TESTCASE);
    }

}
