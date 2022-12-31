package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class SellShareTestCases extends TestBase {
	
	@Test
	public void verifySellShare() throws InterruptedException
	{
		Thread.sleep(2000);
		dash.enterCompanyName("Wipro");
		dash.clickOnCompanyNameWipro();
		Thread.sleep(2000);
		exchange.clickOnSellButton1();
		Thread.sleep(6000);
		exchange.enterQuantityOfShare(500);
		exchange.clickOnSellButton2();
		Thread.sleep(2000);
		String expected_result ="Order Created successfully";
		String actual_result=exchange.getStatus();
		Assert.assertEquals(actual_result, expected_result);
	}
	

}
