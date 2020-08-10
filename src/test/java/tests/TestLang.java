package tests;

import components.LanguageComponents;
import org.testng.annotations.Test;
import pages.*;

public class TestLang extends BaseClass{
    @Test(enabled = false)
    public void langTest(){
        LanguagePage.clickPortuguese();
        LanguagePage.backPage();
        LanguagePage.clickSpanish();
    }

}
