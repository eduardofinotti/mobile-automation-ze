package Pages.InputPages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;


import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;




public class TestCore extends Page{

	public static Properties object = new Properties();
	public static Properties config = new Properties();
	public static AndroidDriver driver;
	public static IOSDriver driver2;
	public static String SCREENSHOT_FOLDER = "target/Screenshots/";
	public static final String SCREENSHOT_FORMAT = ".png";

	
	@BeforeMethod
	public void beforMethod(Method method) throws MalformedURLException{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "android");//note 3- 3204a822185f2173// s3-4df1b3c606d75f11//android//ZY3223FG76
		capabilities.setCapability("appPackage", "br.com.lojong");
		capabilities.setCapability("appActivity", "br.com.lojong.activity.SplashActivity");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		log("--------------------------------------------------------", ILogLevel.TESTCASE);
		log("---------Test ["+method.getName()+"] Started------------", ILogLevel.TESTCASE);
		log("--------------------------------------------------------", ILogLevel.TESTCASE);
		
		
	}

	@AfterMethod
	public void setScreenshot(ITestResult result,Method method) {

		log("--------------------------------------------------------", ILogLevel.TESTCASE);
		log("---------Test ["+method.getName()+"] Finished------------", ILogLevel.TESTCASE);
		log("--------------------------------------------------------", ILogLevel.TESTCASE);

		if(!result.isSuccess()||result.isSuccess()){
			BaseClass.captureScreenshot();
			BaseClass.takeScreenshot("Captured");
		}
		
		driver.quit();

	}

}


