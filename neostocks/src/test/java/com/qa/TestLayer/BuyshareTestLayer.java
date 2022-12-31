package com.qa.TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.pagelayer.BuysharePage;

public class BuyshareTestLayer extends TestBase{
@Test
	public void Verifybuyshare() throws InterruptedException 
	{
		BuysharePage buy= new BuysharePage();
		// buy share wipro
		 
				Thread.sleep(2000);
				buy.enterCompanyName("Wipro");
				 Thread.sleep(2000);
				buy.clickOnCompanyNameWipro();					
				WebElement l = driver.findElement(By.xpath("//span[@class='btn theme-bg btn-sm smallbutton']"));
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("arguments[0].click();", l);
				 Thread.sleep(3000);
				 buy.clickORadioButton();
				 Thread.sleep(2000);
				 buy.ClickOnScrollupbtn();
				// Thread.sleep(6000);
				// log.enterQuantityOfShare("0");
				//log.clickOnBuyButton1();
				//Thread.sleep(2000);
				//log.enterQuantityOfShare("2");
				Thread.sleep(2000);
				buy.ClickOnMarketbuybtn();
				
				String expected_result="MARKET BUY of 2 contract(s) of WIPRO, successfully executed at Rs.387.65\r\n";
				String actual_result=buy.getStatus();
				System.out.println(buy.getStatus());
				Assert.assertEquals(actual_result, expected_result);

	}
}
