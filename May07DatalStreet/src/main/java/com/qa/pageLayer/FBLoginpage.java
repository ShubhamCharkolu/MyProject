package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.FBTestBase;

public class FBLoginpage extends FBTestBase{

	public FBLoginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//email Address
	@FindBy(xpath="//input[@id='email']")
	private WebElement email_address;
	
	public void enterEmailAddress(String email)
	{
		email_address.sendKeys(email);
	}
	
	//Password
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	// Loginbutton
	@FindBy(xpath="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	private WebElement login_btn;
	
	public void clickOnLoginButton()
	{
		login_btn.click();;
	}
	
}
