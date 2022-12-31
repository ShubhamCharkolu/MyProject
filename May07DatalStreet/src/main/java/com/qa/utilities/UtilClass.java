package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase {
	
	static String path = "C:\\Users\\232338\\eclipse-workspace\\May07DatalStreet\\screenshots\\";
	
	public static void takeScreenShot(String filename)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File des = new File(path+filename+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
			
		}	
		
	}
	public void js_executor(int x , int y)
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	}
}

