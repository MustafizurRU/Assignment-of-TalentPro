package com.codecademy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codecademy.qa.base.BaseClass;

public class LoginPage extends BaseClass {

	
	//Page Factory OR
	@FindBy(xpath = "/html/body/div[2]/div/div/header/nav[1]/div/ul/li[8]/a")
	WebElement loginclick;
	@FindBy(id="user_login")
	WebElement userName;
	
	@FindBy(id = "login__user_password")
	WebElement password;
	
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/main/div/div/div/div[1]/form/div/div[4]/div/button")
	WebElement loginbtn;
	
	//Initialization
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//actions:
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pass)
	{
		loginclick.click();
		userName.sendKeys(un);
		password.sendKeys(pass);
		loginbtn.click();
		return new HomePage();
	}
	
}
