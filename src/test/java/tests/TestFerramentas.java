package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class TestFerramentas extends Utils {

    @Test(enabled = false)
    public void ferramentasTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());
        HomePage homePage = new HomePage(driver.get());

        loginPage.login(LoginPage.emailPremium);
        homePage.enterToolsTab();

        takeScreenshotAndSave();
    }

}
