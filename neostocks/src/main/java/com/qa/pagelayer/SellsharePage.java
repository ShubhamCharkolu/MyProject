package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class SellsharePage extends TestBase{
	
	{
		PageFactory.initElements(driver, this);
		
	}
	
		@FindBy(xpath="//span[@id='sb_sbtn969473']")
	private WebElement sellBtn;
	
	public void clickOnSellbtn()
	{
		sellBtn.click();
	}
	
	@FindBy(xpath="//input[@id='rad_qty_fixed']")
	private WebElement radiobtn;
	
	public void clickORadioButton1()
	{
		radiobtn.click();
	}
	
	/*
	@FindBy(xpath="//input[@id='txt_fixedqty']")
	private WebElement Quantitybox;
	
	public void enterQuantityOfSellShare(int count)
	{
		Quantitybox.click();
		Quantitybox.sendKeys(String.valueOf(count));
	}
*/	
	////body/form[@id='ctl01']/div[@id='buysellmodal']/div[1]/div[1]/div[2]/div[5]/div[11]/div[2]/div[1]/div[3]/div[1]/div[2]/span[1]/a[1]/span[1]

	@FindBy(xpath="//body/form[@id='ctl01']/div[@id='buysellmodal']/div[1]/div[1]/div[2]/div[5]/div[11]/div[2]/div[1]/div[3]/div[1]/div[2]/span[1]/a[1]/span[1]")
	private WebElement scroll_upbtn;
	
	public void ClickOnScrollupbtn1()
	{
		scroll_upbtn.click();
	}
	
	
	@FindBy(xpath="//a[@id='lnk_placeorder']")
	private WebElement MarketSellbtn;
	
	public void ClickOnMarketSellbtn()
	{
		MarketSellbtn.click();
		
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return"MARKET SELL of 2 contract(s) of WIPRO, successfully executed at Rs.387.65\\r\\n";
	}
	

}
