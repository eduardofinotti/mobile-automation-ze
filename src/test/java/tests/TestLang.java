package tests;

import hooks.PageFactory;
import org.testng.annotations.Test;
import pages.LanguagePage;
import utils.Utils;

public class TestLang extends Utils {

    @Test(enabled = false)
    public void langTest() {
        PageFactory.initPages();

        clickOn(LanguagePage.idBtnPortuguese);
        Utils.back();
        clickOn(LanguagePage.idBtnSpanish);
    }

}
