package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.InputPages.BaseClass;
import Pages.InputPages.ILogLevel;
import Pages.InputPages.TestCore;
import pageObject.LoginPageObject;

public class ThirdScenarioTest extends TestCore{
	@Test(enabled=false)
	public void thirdScenario() throws InterruptedException{
		LoginPage loginPage = new LoginPage(driver);
		
		log("Test Started [Third Scenario Test] test", ILogLevel.TESTCASE);
		
		BaseClass.takeScreenshot("launch");
		loginPage.clickOnSkipButton();
		loginPage.enterName();
		loginPage.enterEmail();
		loginPage.enterPassword();
		loginPage.clickOnSubmit();
		loginPage.clickOnProgramaCEB();
		assertTrue(loginPage.verifyEquilibrioFirstTab(), "Fail: Equilibrio First Tab doesn't enabled");
		assertTrue(loginPage.verifyTextUsingClassName(LoginPageObject.classname,6,LoginPageObject.equilibrioFirst_id), "Fail: Equilibrio First doesn't open");
		loginPage.clickEquilibrioSecondTab();
		loginPage.openlist();
		assertTrue(loginPage.verifyTextUsingClassName(LoginPageObject.classname,6,LoginPageObject.equilibrioSecond_id), "Fail: Equilibrio Second doesn't open");
		loginPage.clickEquilibrioThirdTab();
		loginPage.openlist();
		assertTrue(loginPage.verifyTextUsingClassName(LoginPageObject.classname,6,LoginPageObject.equilibrioThird_id), "Fail: Equilibrio Third doesn't open");
		loginPage.clickEquilibrioFourthTab();
		loginPage.openlist();
		assertTrue(loginPage.verifyTextUsingClassName(LoginPageObject.classname,6,LoginPageObject.equilibrioFourth_id), "Fail: Equilibrio Fourth doesn't open");
		loginPage.clickEquilibrioFifthTab();
		loginPage.openlist();
		assertTrue(loginPage.verifyTextUsingClassName(LoginPageObject.classname,6,LoginPageObject.equilibrioFifth_id), "Fail: Equilibrio Fifth doesn't open");
		loginPage.clickOnBackButton();
		loginPage.clickOnProgramaMind();
		loginPage.scrollScreen();
		assertTrue(loginPage.isExpectedElementDisplayedAfterScroll(), "Fail: Expected element doesn't dsplayed.");
		
	}

}
