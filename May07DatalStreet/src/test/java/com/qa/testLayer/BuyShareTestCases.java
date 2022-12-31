package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class BuyShareTestCases extends TestBase {
	
	@Test
	public void verifyBuyScenerioWipro() throws InterruptedException
	{
		Thread.sleep(2000);
		dash.enterCompanyName("Wipro");
		dash.clickOnCompanyNameWipro();
		Thread.sleep(2000);
		exchange.clickOnBuyButton1();
		exchange.enterQuantityOfShare(5);
		util.js_executor(0, 500);
		Thread.sleep(2000);
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		String expected_result ="Order Created successfully";
		String actual_result=exchange.getStatus();
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test
	public void verifyBuyScenerioAxis() throws InterruptedException
	{
		Thread.sleep(2000);
		dash.enterCompanyName("Axis");
		dash.clickOnCompanyNameAxis();
		Thread.sleep(2000);
		exchange.clickOnBuyButton1();
		exchange.enterQuantityOfShare(5);
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		String expected_result ="Order Created successfully";
		String actual_result=exchange.getStatus();
		Assert.assertEquals(actual_result, expected_result);
	}

}
