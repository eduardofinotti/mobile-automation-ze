package utils;

import hooks.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CapabilitiesFactory extends BaseClass {

    public static void setCapabilitiesIOSDF() throws MalformedURLException {
        String kobitonServerUrl = "https://unisollus:821a4d4e-b208-4452-bf57-83ba9df8568e@api.kobiton.com/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability("sessionName", "Lojong - iOS Automation");
        capabilities.setCapability("sessionDescription", "Lojong - iOS Automation");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("captureScreenshots", true);
        capabilities.setCapability("app", "kobiton-store:88155");
        capabilities.setCapability("deviceGroup", "KOBITON");
        capabilities.setCapability("deviceName", "Galaxy Tab S5e");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("platformName", "iOS");

        driver = new AndroidDriver(new URL(kobitonServerUrl), capabilities);
    }

    public static void setCapabilitiesAndroidDF() throws MalformedURLException {
        String kobitonServerUrl = "https://unisollus:821a4d4e-b208-4452-bf57-83ba9df8568e@api.kobiton.com/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "br.com.lojong");
        capabilities.setCapability("appActivity", "br.com.lojong.activity.SplashActivity");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setCapability("sessionName", "Lojong - Android Automation");
        capabilities.setCapability("sessionDescription", "Lojong - Android Automation");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("captureScreenshots", true);
        capabilities.setCapability("app", "kobiton-store:88155");
        capabilities.setCapability("deviceGroup", "KOBITON");
        capabilities.setCapability("deviceName", "Galaxy Note10+");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("platformName", "Android");

        driver = new AndroidDriver(new URL(kobitonServerUrl), capabilities);
    }

    public static void setCapabilitiesIOS() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.5");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardofinotti/Desktop/Lojong.app");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            capabilities.setCapability("useNewWDA", true);

            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCapabilitiesAndroid() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel");//note 3- 3204a822185f2173// s3-4df1b3c606d75f11//android//ZY3223FG76
            capabilities.setCapability("appPackage", "br.com.lojong");
            capabilities.setCapability("appActivity", "br.com.lojong.activity.SplashActivity");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardofinotti/Desktop/lojong.apk");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
            capabilities.setCapability("platformVersion", "10.0");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
