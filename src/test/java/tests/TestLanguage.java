package tests;

import org.testng.annotations.Test;
import pages.LanguagePage;
import utils.Utils;

public class TestLanguage extends Utils {

    @Test(enabled = true)
    public void langPortuguesTest() {
        LanguagePage languagePage = new LanguagePage(driver.get());
        clickOn(languagePage.idBtnPortuguese);

//        String value = getText();
//        Assert.assertEquals(value, "Continuar en Portugués");
    }

    @Test(enabled = true)
    public void langEspanishTest() {
        LanguagePage languagePage = new LanguagePage(driver.get());
        clickOn(languagePage.idBtnSpanish);

//        String value = getText();
//        Assert.assertEquals(value, "Continuar en Portugués");
    }
}
