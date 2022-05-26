package com.fanfare.qa.testcases;

import org.testng.annotations.Test;

import com.fanfare.qa.base.BaseClass;

import io.appium.java_client.MobileElement;

public class LoginTest extends BaseClass {

	@Test
	public void LoginTests() throws InterruptedException
	{
			Thread.sleep(500);
			MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.ImageView");
			el1.click();
			Thread.sleep(500);
			MobileElement el2 = (MobileElement) driver.findElementById("com.fanfare.android:id/btnLogin");
			el2.click();
			Thread.sleep(500);
			MobileElement el3 = (MobileElement) driver.findElementById("com.fanfare.android:id/edEmail");
			el3.sendKeys("mmrsaju.cd@gmail.com");
			Thread.sleep(500);
			MobileElement el4 = (MobileElement) driver.findElementById("com.fanfare.android:id/edPassword");
			el4.sendKeys("12345678");
			Thread.sleep(500);
			MobileElement el5 = (MobileElement) driver.findElementById("com.fanfare.android:id/btnLogin");
			el5.click();
			Thread.sleep(500);
			MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView");
			el6.click();
			Thread.sleep(500);
			MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.ImageView");
			el7.click();
			Thread.sleep(500);
			System.out.println("Successfully Login Test Completed..");

	}
}
