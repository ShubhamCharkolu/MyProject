package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.DashboardPage;
import com.qa.pageLayer.ExchangePage;
import com.qa.pageLayer.LoginPage;
import com.qa.utilities.UtilClass;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public DashboardPage dash;
	public ExchangePage exchange;
	public UtilClass util;
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br)
	{	
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		LoginPage login = new LoginPage();
		login.enterEmailAddress("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnLoginButton();
		
		//Object Creation
		dash = new DashboardPage();
		exchange = new ExchangePage();
		util = new UtilClass();
	}
	
	@AfterMethod
	public void tearDown()
	{
//		driver.quit();
	}

}
