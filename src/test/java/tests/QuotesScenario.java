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
public class QuotesScenario extends TestCore{
    
    @Test
    public void quotesScenario() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        log("Test Started [Quotes Scenario Test] test", ILogLevel.TESTCASE);
        loginPage.clickOnSkipButton();
        loginPage.clickLogin();
        loginPage.enterEmail1();
        loginPage.enterPassword1();
        loginPage.clickEnter();
        loginPage.clickInSight();
        loginPage.clickCitacoes();
        loginPage.scrollOneFunamentos();
        log("Test Completed Successfully", ILogLevel.TESTCASE);
    }
}
