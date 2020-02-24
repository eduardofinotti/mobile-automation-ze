package Pages;

import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Pages.InputPages.BaseClass;
import Pages.InputPages.ILogLevel;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import pageObject.LoginPageObject;

public class LoginPage extends BaseClass {

    public LoginPage(AppiumDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
    Date date = new Date();
    public String name = "QA" + dateFormat.format(date);
    public String email = "test" + dateFormat.format(date) + "@mailinator.com";
    public String password = "Testing" + AutogenerateNumbers(4);

    public String name1 = "Sachin";
    public String email1 = "sachin@tester.com";
    public String password1 = "1234";

    public void clickOnSkipButton() {
        if (isElementPresent(By.id(LoginPageObject.skipButton_id))) {
            click(By.id(LoginPageObject.skipButton_id), "[Skip] button", 7);
        }
        takeScreenshot("Skip button");
    }

    public void clickOnCreateAccount() {
        click(By.xpath(LoginPageObject.createAccount_xpath), "[CRIAR CONTA] button", 3);
        takeScreenshot("Create Account");
    }

    public void enterName() {
        driver.findElement(By.id(LoginPageObject.name_id)).click();
        if (isElementPresent(By.id("android:id/button1"))) {
            driver.findElement(By.id("android:id/button1")).click();
            sendKeys(By.id(LoginPageObject.name_id), name, 3, name);
            takeScreenshot("Name");
        } else {
            sendKeys(By.id(LoginPageObject.name_id), name, 3, name);
            takeScreenshot("Name");
        }
    }

    public void enterName1() {
        driver.findElement(By.id(LoginPageObject.name_id)).click();
        if (isElementPresent(By.id("android:id/button1"))) {
            driver.findElement(By.id("android:id/button1")).click();
            sendKeys(By.id(LoginPageObject.name_id), name1, 3, name1);
            takeScreenshot("Name");
        } else {
            sendKeys(By.id(LoginPageObject.name_id), name1, 3, name1);
            takeScreenshot("Name");
        }
    }

    public void enterEmail() {
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
        }
        sendKeys(By.id(LoginPageObject.email_id), email, 3, email);
        takeScreenshot("Email");
    }

    public void enterEmail1() {
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
        }
        sendKeys(By.id(LoginPageObject.email_id), email1, 3, email1);
        //takeScreenshot("Email");
    }

    public void enterPassword() {
        sendKeys(By.id(LoginPageObject.password_id), password, 3, password);
        takeScreenshot("Password");
    }

    public void enterPassword1() {
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
        }

        sendKeys(By.id(LoginPageObject.password_id), password1, 3, password1);

        try {
            driver.hideKeyboard();
        } catch (Exception e) {
        }
        takeScreenshot("Login");
    }

    public void clickOnSubmit() {
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
        }
        click(By.id(LoginPageObject.submit_id), "[Criar Conta] button", 3);
        takeScreenshot("Submit");
    }

    public void clickOnCaminho() {
        takeScreenshot("Chaminho");
        pause(20);
        scrollTo();
        pause(3);
        waitForElementDisplayed(By.id(LoginPageObject.caminho_id));
        click(By.id(LoginPageObject.caminho_id), "Chaminho", 4);
    }

    public void clickOnProgramaCEB() {
        takeScreenshot("programaCEB");
        pause(10);
        scrollTo();
        pause(3);
        waitForElementDisplayed(By.id(LoginPageObject.programaCEB_id));
        click(By.id(LoginPageObject.programaCEB_id), "programaCE", 6);
    }

    public void clickOnProgramaMind() {
        pause(10);
        takeScreenshot("programaMind");
        waitForElementDisplayed(By.id(LoginPageObject.programaMind_id));
        click(By.id(LoginPageObject.programaMind_id), "Programa Mindfulness", 4);
    }

    public void clickOnOnetab() {
        waitForElementDisplayed(By.id(LoginPageObject.one_id));
        click(By.id(LoginPageObject.one_id), "1", 3);
        takeScreenshot("1");
    }

    public boolean verifyEquilibrioFirstTab() {
        waitForElementDisplayed(By.id(LoginPageObject.pagePROGRAMACEBHeader_id));
        takeScreenshot("equilibrioFirstTab");
        boolean ele = driver.findElement(By.id(LoginPageObject.equilibrioFirst_id)).isEnabled();
        if (ele) {
            log("[" + getText(By.id(LoginPageObject.equilibrioFirst_id)) + "] is already selected", ILogLevel.ASSERTS);
            return true;
        } else {
            return false;
        }

    }

    public void clickEquilibrioSecondTab() {
        click(By.id(LoginPageObject.equilibrioSecond_id), "[Equilibrio Second] tab", 10);
        takeScreenshot("EquilibrioSecondTab");
    }

    public void clickEquilibrioThirdTab() {
        click(By.id(LoginPageObject.equilibrioThird_id), "[Equilibrio Third] tab", 10);
        takeScreenshot("EquilibrioThirdTab");
    }

    public void clickEquilibrioFourthTab() {
        click(By.id(LoginPageObject.equilibrioFourth_id), "[Equilibrio Fourth] tab", 10);
        takeScreenshot("EquilibrioFourthTab");
    }

    public void clickEquilibrioFifthTab() {
        click(By.id(LoginPageObject.equilibrioFifth_id), "[Equilibrio Fifth] tab", 10);
        takeScreenshot("EquilibrioFifthTab");
    }

    public void clickOnIntroductionVideo() {
        click(By.id(LoginPageObject.introduction_id), "[Introduction] tab", 10);
        takeScreenshot("Introduction");
    }

    public void clickOnCloseButton() {
        if (isElementPresent(By.id(LoginPageObject.closeButton_id))) {
            click(By.id(LoginPageObject.closeButton_id), "[X] icon", 3);
            takeScreenshot("Close");
        } else {
            driver.navigate().back();
            takeScreenshot("back");
        }
    }

    public void openlist() {
        if (isElementPresent(By.id(LoginPageObject.openButton_id))) {
            click(By.id(LoginPageObject.openButton_id), "[open] icon", 3);
            takeScreenshot("Open");
        }
    }

    public void clickOnSimOption() {
        click(By.id(LoginPageObject.yesButton_id), "Sim", 3);
        takeScreenshot("Sim");
    }

    public void clickOnProfileTab() {
        click(By.id(LoginPageObject.profiletab_id), "[Profile] tab", 3);
        takeScreenshot("Profile");
    }

    public boolean isProfileNamePresent(String _name) {
        boolean text = isElementPresent(By.id(LoginPageObject.profileName_id));
        String name = driver.findElement(By.id(LoginPageObject.profileName_id)).getText();
        if (name.equals(_name)) {
            log(name + " is present on Profile page", ILogLevel.ASSERTS);
            return true;
        }
        return false;
    }

    public boolean isTextPresent() {
        pause(5);
        boolean text = isElementPresent(By.id(LoginPageObject.categoryText_id));
        if (text) {
            log(name + " list opened", ILogLevel.ASSERTS);
            return true;
        }
        return false;
    }

    public boolean verifyTextUsingClassName(String classname, int index, String textId) {
        java.util.List<WebElement> melement = driver.findElements(By.className(classname));
        String gettext = melement.get(index).getText();
        String text = driver.findElementById(textId).getText();
        if (gettext.equals(text)) {
            return true;
        } else {
            return false;
        }
    }

    public void clickTextUsingClassName(String classname, String text, int _wait) {
        java.util.List<WebElement> melement = driver.findElements(By.className(classname));
        for (int i = 0; i < melement.size(); ++i) {
            String gettext = melement.get(i).getText();
            if (gettext.contains(text)) {
                driver.findElements(By.className(classname)).get(i).click();
                pause(_wait);
            }
        }

    }

    public void clickOnVideoTab() {
        click(By.id(LoginPageObject.videoTab_id), "[Videos] tab", 3);
        takeScreenshot("Videos");
    }

    public void clickOnVideoPlaybutton() {
        pause(8);
        click(By.id(LoginPageObject.videoPlaybutton_id), "[Play] button", 5);
        takeScreenshot("Play");
        driver.navigate().back();
        takeScreenshot("Back");
    }

    public void playVideo() {
        pause(8);
        click(By.id(LoginPageObject.videoPlaybutton_id), "[Play] button", 5);
        takeScreenshot("Play");
    }

    public void clickDepois() {

        log("Wait till audio finished", ILogLevel.TEST);
        waitForAudioVideoFinished(By.id(LoginPageObject.depois_id));
        takeScreenshot("depois");
        click(By.id(LoginPageObject.depois_id), "Depois button clicked", 3);
        takeScreenshot("Introduction");

    }

    public void clickInSight() {
        click(By.id(LoginPageObject.insight_id), "Insight button clicked", 15);
        takeScreenshot("Insight");
    }

    public void clickPraticas() {
        click(By.id(LoginPageObject.praticas_id), "Practicies button clicked", 15);
        takeScreenshot("Practicies");
    }

    public void clickFundamentos() {
        //List<WebElement> elementes = driver.findElement(By.id(LoginPageObject.treinamentos)).findElements(By.className("android.widget.RelativeLayout"));

        // for(WebElement elemente: elementes){
        //  elemente.get
        //}
        //elementes.get(1).click();
        //pause(15);
        // click(By.xpath(LoginPageObject.fundamentos),"Fundamentos clicked", 15);
        //click(By.id("br.com.lojong:id/tvPracticeCategory"),"Fundamentos clicked", 15);
        try {
            click(By.xpath(LoginPageObject.fundamentooText), "Fundamentos", 15);
        } catch (Exception e) {
            clickTextUsingClassName(LoginPageObject.classname, "Fundamentos", 15);
        }
        takeScreenshot("Fundamentos");
    }

    public void clickOnBackButton() {
        click(By.id(LoginPageObject.buttonBack_id), "Back button Clicked", 15);
        takeScreenshot("Backbutton");
    }

    public void clickArtigos() {
        log("Artigos clicked", ILogLevel.TEST);
        try {
            click(By.xpath(LoginPageObject.artigos), "ARTIGOS", 15);
            takeScreenshot("Artigos");
        } catch (Exception e) {
            clickTextUsingClassName(LoginPageObject.classname, "ARTIGOS", 15);
            takeScreenshot("Artigos");
        }

    }

    public void clickCitacoes() {
        log("Citacões clicked", ILogLevel.TEST);
        try {
            click(By.xpath(LoginPageObject.citacoes), "CITAÇÕES", 15);
            takeScreenshot("Citacoes");
        } catch (Exception e) {
            clickTextUsingClassName(LoginPageObject.classname, "CITAÇÕES", 15);
            takeScreenshot("Citacoes");
        }

    }

    public void clickTimer() {
        click(By.id(LoginPageObject.timer_id), "Timer button clicked", 4);
        takeScreenshot("timer");
    }

    public void clickIniciar() throws InterruptedException {
        click(By.id(LoginPageObject.iniciar_id), "Iniciar button clicked", 2);
        takeScreenshot("iniciar");
        log("Wait for 20 seconds", ILogLevel.TEST);
        Thread.sleep(20000);
    }

    public void scroll() {
        /*Dimension dimensions = driver.manage().window().getSize();
	    int Startpoint = (int) (dimensions.getHeight() * 0.5);
	    int scrollEnd = (int) (dimensions.getHeight() * 0.5);
	    driver.swipe(200, Startpoint,200,scrollEnd,2000);*/

    }

    /*public void scroll1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
	}*/
    public void scrollTo() {
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.30;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.90;
        int scrollEnd = screenHeightEnd.intValue();
        driver.swipe(0, scrollEnd, 0, scrollStart, 2000);
    }

    public void scrollOneFunamentos() {
        for (int i = 1; i <= 15; i++) {
            Dimension dimensions = driver.manage().window().getSize();
            Double screenHeightStart = dimensions.getHeight() * 0.30;
            int scrollStart = screenHeightStart.intValue();
            Double screenHeightEnd = dimensions.getHeight() * 0.90;
            int scrollEnd = screenHeightEnd.intValue();
            driver.swipe(0, scrollEnd, 0, scrollStart, 2000);
        }
        takeScreenshot("bottom[ElementAfterScroll");
    }

    public void clickDay1() {
        click(By.id(LoginPageObject.fundamentosonetday), "Day 1 clicked", 10);
        takeScreenshot("Day 1");
    }

    public void clickDay1Audio1() {
        try {
            click(By.xpath(LoginPageObject.day1audio1), "O que é meditação?", 5);
        } catch (Exception e) {
            clickTextUsingClassName(LoginPageObject.classname, "O que é meditação?", 5);
        }
        log("O que é meditação? clicked", ILogLevel.TEST);
        takeScreenshot("O que é meditação?");
    }

    public void iniciar() {
        log("INICIAR clicked", ILogLevel.TEST);
        try {
            click(By.xpath(LoginPageObject.iniciarbtn), "INICIAR", 0);
            pause(100);
            takeScreenshot("INICIAR");
        } catch (Exception e) {
            clickTextUsingClassName("android.widget.Button", "INICIAR", 0);
            pause(100);
            takeScreenshot("INICIAR");
        }
    }

    public void scrollScreen() {
        for (int i = 1; i <= 15; i++) {
            Dimension dimensions = driver.manage().window().getSize();
            Double screenHeightStart = dimensions.getHeight() * 0.30;
            int scrollStart = screenHeightStart.intValue();
            Double screenHeightEnd = dimensions.getHeight() * 0.90;
            int scrollEnd = screenHeightEnd.intValue();
            driver.swipe(0, scrollStart, 0, scrollEnd, 2000);
        }
        takeScreenshot("top[ElementAfterScroll");

    }

    public boolean isExpectedElementDisplayedAfterScroll() {
        boolean ele = driver.findElement(By.id(LoginPageObject.topElementOfScreen_id)).isDisplayed();
        if (ele) {
            log("[Compaixão a todas as Pessoas] text  displays", ILogLevel.ASSERTS);
            return true;
        } else {
            return false;
        }
    }

    public boolean waitForElementTreinamentor() {
        waitForElementDisplayed(By.xpath("//android.widget.TextView[@text='Treinamentos']"));
        boolean ele = driver.findElement(By.xpath("//android.widget.TextView[@text='Treinamentos']")).isDisplayed();
        if (ele) {
            log("[Treinamentos] text  displays", ILogLevel.ASSERTS);
            return true;
        } else {
            return false;
        }
    }

    public void clickAcolhendoTab() {
        takeScreenshot("Acolhendo tab");
        click(By.id(LoginPageObject.acolhendo_id), "Acolhendo tab", 2);
    }

    public void acolhendoNumbersClick(String text) {
        waitForElementDisplayed(By.xpath(LoginPageObject.acolhendoNumbers_xpath + text + LoginPageObject.acolhendoNumbers_xpath1));
        click(By.xpath(LoginPageObject.acolhendoNumbers_xpath + text + LoginPageObject.acolhendoNumbers_xpath1), text + " digit On circle", 2);
        arrowClick();
        takeScreenshot("acolhandoNumberArrow " + text);
    }

    public void arrowClick() {
        click(By.id(LoginPageObject.slideArrow_id), "Arrow Button Clicked", 2);
    }

    public void clickLogin() {
        waitForElementDisplayed(By.xpath(LoginPageObject.loginButton_xpath));
        click(By.xpath(LoginPageObject.loginButton_xpath), "JÁ TENHO UMA CONTA", 3);
    }

    public void clickEnter() {
        if (isElementPresent(By.xpath(LoginPageObject.enterButton_xpath))) {
            click(By.xpath(LoginPageObject.enterButton_xpath), "ENTRAR", 7);
            takeScreenshot("Práticas");
        }
    }

}
