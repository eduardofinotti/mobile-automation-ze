package pages;

import components.CreateAccountComponents;
import components.LoginComponents;
import components.PracticesComponents;
import org.openqa.selenium.By;
import tests.BaseClass;

public abstract class PracticesPage extends BaseClass {

    public static void scrollToBottom() {
        scrollToId(PracticesComponents.cardInstagram);
        captureScreenshot();
    }

    public static void scrollToTop() {
        scrollToId(PracticesComponents.idTopPrac);
        captureScreenshot();
    }

    public static void scrollAndClickCultivandoHabitoPT() {
        log("[CLICK CULTIVANDO O HÁBITO]");
        scrollToTextClick(PracticesComponents.textCultivandoHabitoPT);
        pause(4);
        captureScreenshot();
    }

    public static void scrollAndClickCaminhoPT() {
        log("[CLICK CAMINHO]");
        scrollToTextClick(PracticesComponents.textCaminhoPT);
        pause(4);
        captureScreenshot();
    }

    public static void scrollAndClickFundamentosPT() {
        log("[CLICK FUNDAMENTOS]");
        scrollToTextClick(PracticesComponents.textFundamentosPT);
        pause(4);
        captureScreenshot();
    }


}
