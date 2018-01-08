package com.Zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoho.generic.BasePage;

public class LoginPage extends BasePage
{
	//Declaration
	@FindBy(id="userName")
	private WebElement userNameTB;
	
	@FindBy(id="passWord")
	private WebElement passwordTB;
	
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement signInBTN;
	
	@FindBy(xpath="//td[@class='small mandatory']")
	private WebElement errMsg;
	
	@FindBy(xpath="//a[.='Home']")
	private WebElement homeLink;
	
	@FindBy(xpath="//a[.='Forums']")
	private WebElement forumsLink;
	
	
	
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterUserName(String un)
	{
		userNameTB.sendKeys(un);
	}
	
	public void enterPassword(String pwd)
	{
		passwordTB.sendKeys(pwd);
	}
	public void clickOnSignin()
	{
		signInBTN.click();
	}
	public void clickOnHomeLink()
	{
		homeLink.click();
	}
	public void clickOnForumsLink()
	{
		forumsLink.click();
	}
	
	public void verifyingTitle(String eTitle)
	{
		VerifyTitle(eTitle);
	}
	public void verifyErrMsg(WebElement element)
	{
		verifyElement(element);
	}
}
