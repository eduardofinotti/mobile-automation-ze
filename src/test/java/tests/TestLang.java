package tests;

import org.testng.annotations.Test;
import pages.LanguagePage;
import utils.Utils;

public class TestLang extends Utils {

    @Test(enabled = true)
    public void langTest() {
        LanguagePage languagePage = new LanguagePage(driver);

        clickOn(languagePage.idBtnPortuguese);
        Utils.back();
        clickOn(languagePage.idBtnSpanish);
    }

}
