package tests;

import components.IntroductionComponents;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class BaseClass {

    public static AndroidDriver<MobileElement>  driver;

    @BeforeTest
    public void setup() throws MalformedURLException {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "android");//note 3- 3204a822185f2173// s3-4df1b3c606d75f11//android//ZY3223FG76
            capabilities.setCapability("appPackage", "br.com.lojong");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
            //capabilities.setCapability(MobileCapabilityType.UDID,"ZF52326R3M");
            capabilities.setCapability("appActivity", "br.com.lojong.activity.SplashActivity");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            log("--------------------------------------------------------");
            log("----------------------Test Start------------------------");
            log("--------------------------------------------------------");

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @AfterTest
    public void teardown(){
        log("--------------------------------------------------------");
        log("----------------------Test Finish-----------------------");
        log("--------------------------------------------------------");
        driver.quit();
    }

    public static void log(String msg){
        if(msg!=null)
            System.out.println(msg);
    }

    public static void pause(int seconds) {
        try {
            Thread.sleep(seconds * 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void click(By _by, String _log, int _wait) {
        driver.findElement(_by).click();
        if(_log!=null){
            log("[" + _log + "]");
        }
        pause(_wait);
    }

    public static void captureScreenshot() {
        String name = new Date().toString();
        String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
        System.out.println(screenshot.getPath());
    }

    public static void clickByText(String text,String _log,int _wait){
        driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\""+text+"\")").click();
        if(_log!=null){
            log("[" + _log + "]");
        }
        pause(_wait);
    }
    public static void sendKeys(By _by, String _key, int _wait, String _log) {
        driver.findElement(_by).sendKeys(_key);
        log(_log);
        pause(_wait);
    }

    public static boolean waitForElementDisplayed(By by) {
        for (int sec = 1; sec <= 1; sec++) {
            try {
                if (driver.findElement(by).isDisplayed()) {

                    //captureScreenshot();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //  analyzeBrowserLogs();
        return false;
    }

    public static void scrollToId(String id) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""+id+"\").instance(0))");
    }
    public static void scrollToText(String text) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+text+"\").instance(0))");
    }

    public static void scrollToTextClick(String text) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+text+"\").instance(0))").click();
    }
    public static void scrollToTextClickHorizontal(String text) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().scrollIntoView(new UiSelector().text(\""+text+"\").instance(0))").click();

    }
}
