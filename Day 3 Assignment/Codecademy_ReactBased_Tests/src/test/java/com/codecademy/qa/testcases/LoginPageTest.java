package com.codecademy.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codecademy.qa.base.BaseClass;
import com.codecademy.qa.pages.HomePage;
import com.codecademy.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass {

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Learn to Code - for Free | Codecademy");
		System.out.println("Title Test is Passed");
	}
	
	@Test(priority = 2)
	public void LoginTest() throws InterruptedException
	{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Login Test is Passed");
		Thread.sleep(10000);
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
