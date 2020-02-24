package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.InputPages.BaseClass;
import Pages.InputPages.ILogLevel;
import Pages.InputPages.TestCore;
import pageObject.LoginPageObject;

public class ForthScenario extends TestCore{

	@Test(enabled=false)
	public void forthScenario() throws InterruptedException{
		LoginPage loginPage = new LoginPage(driver);
		
		log("Test Started [Fourth Scenario Test] test", ILogLevel.TESTCASE);
		
		//BaseClass.takeScreenshot("launch");
		loginPage.clickOnSkipButton();
		loginPage.clickLogin();
		loginPage.enterEmail1();
		loginPage.enterPassword1();
		loginPage.clickEnter();
		assertTrue(loginPage.waitForElementTreinamentor(), "Treinamentos does not appears");
		loginPage.scrollTo();
		loginPage.clickAcolhendoTab();
		loginPage.acolhendoNumbersClick("1");
		loginPage.acolhendoNumbersClick("2");
		loginPage.acolhendoNumbersClick("3");
		loginPage.acolhendoNumbersClick("4");
		loginPage.acolhendoNumbersClick("5");
		loginPage.acolhendoNumbersClick("6");
		loginPage.acolhendoNumbersClick("7");
		loginPage.acolhendoNumbersClick("8");
		
	}
}
