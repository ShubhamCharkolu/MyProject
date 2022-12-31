package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.FBLoginpage;
import com.qa.testBase.FBTestBase;

public class FBLoginPageTest extends FBTestBase {
	@Test
	public void verifyLoginTest()
	{
		FBLoginpage login = new FBLoginpage();
		login.enterEmailAddress("sanketjerry@gmail.com");
		login.enterPassword("anna@2809");
		login.clickOnLoginButton();
}
}