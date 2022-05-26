package com.fanfare.qa.base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {
	protected AppiumDriver<MobileElement> driver;
	static String projectpath;
	@BeforeTest
	public void setup()
	{
		
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			//dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			dc.setCapability("platformName", "android");
			dc.setCapability("deviceName", "Xiaomi M2006C3Mll");
		 	dc.setCapability("platformVersion", "10QP1A.190711.020");
			dc.setCapability("appPackage", "com.fanfare.android");
			dc.setCapability("appWaitActivity", "com.fanfare.android.activities.launch.StartScreenActivity");
			projectpath = System.getProperty("user.dir");
			dc.setCapability("app", projectpath + "/src/test/resources/apps/fanfare.apk");
			dc.setCapability("autoGrantPermissions", "true");
			URL url= new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url,dc);
			//IOSDriver<IOSElement>driver2 = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4733/wd/hub"), dc);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Thread.sleep(1000);
		
		}catch (Exception e) {
			System.out.println("Cause is: "+e.getCause());
			System.out.println("Message"+e.getMessage());
			e.printStackTrace();
		}
		
	}
	

	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
}
