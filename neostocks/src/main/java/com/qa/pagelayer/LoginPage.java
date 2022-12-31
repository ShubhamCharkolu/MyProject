package com.qa.pagelayer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginPage  extends TestBase {
  public LoginPage()
  {
	  PageFactory.initElements(driver, this);
  }
  //EnterMob Num
  @FindBy(xpath="(//a[@class='btn btn-success button_success'])[1]")
  private WebElement Signup;
  public void clickonsignInbtn()
  {
	  Signup.click();
  }
  @FindBy(xpath="//input[@id='MainContent_signinsignup_txt_mobilenumber']")
 private WebElement MobNum;
  public void EnterMobNum(String Mobno)
  {
	  MobNum.sendKeys(Mobno);
  }
  
  @FindBy(xpath="//a[@id='lnk_signup1']")
  private WebElement signupbtn;
   public void ClickOnsignupbutn()
   {
 	  signupbtn.click();
   }
   @FindBy(xpath="//input[@id='txt_accesspin']")
   private WebElement Password;
    public void EnterPassword(String Pass)
    {
    	Password.sendKeys(Pass);
    }
   
    @FindBy(xpath="//a[@id='lnk_submitaccesspin']")
    private WebElement Submit;
     public void ClickOnSubmitbtn()
     {
     	Submit.click();
     }
    
     @FindBy(xpath="//*[@id=\"modal_neostoxinfo\"]/div/div/div[1]/button/span")
     private WebElement Ok;
     public void ClickOnOKBtn()
     {
    	 Ok.click();
     }
     
     @FindBy(xpath="(//a[@class='neobutton'])[25]")
     private WebElement clsBtn;
      public void ClickOnCloseBtn()
      {
      	clsBtn.click();
 }
   
      
      @FindBy(xpath="//input[@id='txt_instruments']")
      private WebElement SearchBox;
       public void EnterCompany(String Company)
       {
       	SearchBox.sendKeys(Company);
  }
       @FindBy(xpath="//input[@id='txt_instruments']")
   	private WebElement search_box;
   	
   	public void enterCompanyName(String company_name)
   	{
   		search_box.sendKeys(company_name);
   	}																		   	
   	@FindBy(linkText="WIPRO")
   	private WebElement click_company_name_wipro;
   	
   	public void clickOnCompanyNameWipro()
   	{
   		click_company_name_wipro.click();
   	}
  	
   	@FindBy(xpath="//span[@id='sb_bbtn969473']")
	private WebElement buy_btn1;
	
	public void clickOnBuyButton1()
	{
		buy_btn1.click();
	}
	
	@FindBy(xpath="//input[@id='rad_qty_fixed']")
	private WebElement radiobtn;
	
	public void clickORadioButton()
	{
		radiobtn.click();
	}
	
	/*@FindBy(xpath="//input[@id='txt_fixedqty']")
	private WebElement Quantitybox;
	
	public void enterQuantityOfShare(String count)
	{
		Quantitybox.click();
		Quantitybox.sendKeys(String.valueOf(count));
	}
	
*/
	
	@FindBy(xpath="(//span[contains(@class,\"ui-button-icon ui-icon ui-icon-triangle-1-n\")])[13]")
	private WebElement scroll_upbtn;
	
	public void ClickOnScrollupbtn()
	{
		scroll_upbtn.click();
	}
	
	
	@FindBy(xpath="//a[@id='lnk_placeorder']")
	private WebElement Marketbuybtn;
	
	public void ClickOnMarketbuybtn()
	{
		Marketbuybtn.click();
		
	}

}
   
	
	