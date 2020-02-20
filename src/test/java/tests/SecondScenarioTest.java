package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.InputPages.BaseClass;
import Pages.InputPages.ILogLevel;
import Pages.InputPages.TestCore;
import Pages.LoginPage;

public class SecondScenarioTest extends TestCore{
	
	
	
	@Test(enabled=false)
	public void secondScenarioTest() throws InterruptedException{
		LoginPage loginPage = new LoginPage(driver);
		
		log("Test Started [Second Scenario] test", ILogLevel.TESTCASE);
		
		BaseClass.takeScreenshot("launch");
		loginPage.clickOnSkipButton();
		loginPage.enterName();
		loginPage.enterEmail();
		loginPage.enterPassword();
		loginPage.clickOnSubmit();
		loginPage.clickOnCaminho();
		loginPage.clickOnOnetab();
		loginPage.clickOnIntroductionVideo();
		loginPage.clickDepois();
		loginPage.clickInSight();
		loginPage.playVideo();
		loginPage.clickArtigos();
		loginPage.clickCitacoes();
		loginPage.clickTimer();
		loginPage.clickIniciar();
		loginPage.clickOnCloseButton();
		loginPage.clickOnSimOption();
		loginPage.clickOnProfileTab();
		Assert.assertTrue(loginPage.isProfileNamePresent(loginPage.name), "[Name] doesn't present on profile page");
		log("Test Completed Successfully", ILogLevel.TESTCASE);
	}

}
