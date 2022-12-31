package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pagelayer.BuysharePage;
import com.qa.pagelayer.LoginPage;
import com.qa.pagelayer.SellsharePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public LoginPage log;
	public BuysharePage buy;
	public SellsharePage sell;
	public static  WebDriver driver;
	@Test
	@BeforeMethod
	public void Start() throws InterruptedException
	 { 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://neostox.com/sign-in");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 
		   log = new LoginPage();
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
			
			 buy= new BuysharePage();
			// buy share wipro
			 sell= new SellsharePage();
			// buy share wipro
	
	 }
	

/*	@AfterMethod
public void tear()
	{
		driver.quit();
	}
	*/
}
