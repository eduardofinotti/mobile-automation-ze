package hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static ThreadLocal<AppiumDriverLocalService> service = new ThreadLocal<>();
    public static AppiumDriver driver;

    String platform = System.getProperty("platform").toLowerCase();

    private static Logger log = LoggerFactory.getLogger(BaseClass.class);

//    public AppiumDriverLocalService getService() {
//        return service.get();
//    }

    @BeforeTest
    public void setup() {

        if (platform.equalsIgnoreCase("android")) {
            setCapabilitiesAndroid();
        } else {
            setCapabilitiesIOS();
        }

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        log.info("--------------------------------------------------------");
        log.info("----------------------Test Start------------------------");
        log.info("--------------------------------------------------------");
    }

    private void setCapabilitiesIOS() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.1");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardo.finotti/Desktop/iFood.app");

//            driver.set(new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCapabilitiesAndroid() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 2");//note 3- 3204a822185f2173// s3-4df1b3c606d75f11//android//ZY3223FG76
            capabilities.setCapability("appPackage", "br.com.lojong");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardo.finotti/Desktop/app-universal-release.apk");
            capabilities.setCapability("appActivity", "br.com.lojong.activity.SplashActivity");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);

//            driver.set(new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void teardown() {
        log.info("--------------------------------------------------------");
        log.info("----------------------Test Finish-----------------------");
        log.info("--------------------------------------------------------");

        driver.quit();
//        getService().stop();
    }

    public static void captureScreenshot() {
        String name = new Date().toString();
        String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
        log.info(screenshot.getPath());
    }

}
