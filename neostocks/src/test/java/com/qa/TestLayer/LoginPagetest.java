package com.qa.TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.qa.TestBase.TestBase;
import com.qa.pagelayer.BuysharePage;
import com.qa.pagelayer.LoginPage;
import com.qa.pagelayer.SellsharePage;

public class LoginPagetest extends TestBase {
@Test
	public void verifySignup() throws InterruptedException
	{
		LoginPage log = new LoginPage();
		log.clickonsignInbtn();
		Thread.sleep(2000);
		log.EnterMobNum("9168146570");
		log.ClickOnsignupbutn();
		Thread.sleep(2000);
		log.EnterPassword("2809");
		log.ClickOnSubmitbtn();
		Thread.sleep(1000);
		log.ClickOnOKBtn();
		log.ClickOnCloseBtn();
		Thread.sleep(2000);
	/*	
		// buy share wipro
		log.enterCompanyName("Wipro");
		log.clickOnCompanyNameWipro();				//	
		WebElement l = driver.findElement(By.xpath("//span[@class='btn theme-bg btn-sm smallbutton']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", l);
		 Thread.sleep(3000);
		 log.clickORadioButton();
		 Thread.sleep(2000);
		 log.ClickOnScrollupbtn();
		// Thread.sleep(6000);
		// log.enterQuantityOfShare("0");
		//log.clickOnBuyButton1();
		//Thread.sleep(2000);
		//log.enterQuantityOfShare("2");
		Thread.sleep(2000);
		log.ClickOnMarketbuybtn();
		 
	
				BuysharePage buy= new BuysharePage();
				
				// buy share wipro
			//	Thread.sleep(2000);
		//		buy.enterCompanyName("Wipro");
			//	 Thread.sleep(2000);
		//		buy.clickOnCompanyNameWipro();				//	
				WebElement buy1 = driver.findElement(By.xpath("//span[@class='btn theme-bg btn-sm smallbutton']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", buy1);
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
				
				
				
	//------------------------------------------------------------------------------------------			
				SellsharePage sell= new SellsharePage();
				// Sell share wipro
				
						WebElement Sell = driver.findElement(By.xpath("//span[@id='sb_sbtn969473']"));
						JavascriptExecutor js1 = (JavascriptExecutor) driver;
						js1.executeScript("arguments[0].click();", Sell);
						// Thread.sleep(2000);
						 //sell.clickOnSellbtn();
						Thread.sleep(2000);
						sell.clickORadioButton1();
						 Thread.sleep(3000);
						 sell.ClickOnScrollupbtn1();
				//		 Thread.sleep(4000);
				//		 sell.enterQuantityOfSellShare(0);
				//		 Thread.sleep(3000);
				//	sell.enterQuantityOfSellShare(2);
						Thread.sleep(2000);
						sell.ClickOnMarketSellbtn();

*/
			

		
		
	}
}
