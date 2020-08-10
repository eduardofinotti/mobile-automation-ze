package pages;

import components.InsightComponents;
import components.MainComponents;
import org.openqa.selenium.By;
import tests.BaseClass;

public class InsightPage extends BaseClass {

    public static void scrollToBottomVideos() {
        scrollToText(InsightComponents.textFinalVideo);
        captureScreenshot();
    }

    public static void scrollToTopVideos() {
        scrollToText(InsightComponents.textTopVideo);
        captureScreenshot();
    }

    public static void clickArtigos() {
        clickByText(InsightComponents.textArtigos, "[CLICK ARTIGOS]", 5);
        captureScreenshot();
    }

    public static void scrollToBottomArtigos() {
        scrollToText(InsightComponents.textFinalArtigos);
        captureScreenshot();
    }

    public static void scrollToTopArtigos() {
        scrollToText(InsightComponents.textTopArtigos);
        captureScreenshot();
    }

    public static void clickCitacoes() {
        clickByText(InsightComponents.textCitacoes, "[CLICK CITAÇÕES]", 5);
        captureScreenshot();
    }

    public static void scrollToBottomCitacoes() {
        scrollToText(InsightComponents.textFinalCitacoes);
        captureScreenshot();
    }

    public static void scrollToTopCitacoes() {
        scrollToText(InsightComponents.textTopCitacoes);
        captureScreenshot();
    }
}
