package com.qa.TestLayer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.pagelayer.SellsharePage;

public class SellshareTestLayer extends TestBase{
@Test
	public void VerifySellShare() throws InterruptedException {
		SellsharePage sell= new SellsharePage();
		// buy share wipro
		 
				//	
		WebElement Sell = driver.findElement(By.xpath("//span[@id='sb_sbtn969473']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", Sell);
		// Thread.sleep(3000);
		// sell.clickOnSellbtn();
		 Thread.sleep(2000);
		 sell.clickORadioButton1();
		 Thread.sleep(3000);
		 sell.ClickOnScrollupbtn1();
		 Thread.sleep(2000);
	//	 sell.enterQuantityOfSellShare(0);
	//	Thread.sleep(6000);
	//	sell.enterQuantityOfSellShare(2);
		Thread.sleep(2000);
		sell.ClickOnMarketSellbtn();
		
		String expected_result="MARKET SELL of 2 contract(s) of WIPRO, successfully executed at Rs.387.65\r\n";
		String actual_result=sell.getStatus();
		System.out.println(sell.getStatus());
		Assert.assertEquals(actual_result, expected_result);



	}
}
