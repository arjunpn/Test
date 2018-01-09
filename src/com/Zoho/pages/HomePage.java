package com.Zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoho.generic.BasePage;

public class HomePage extends BasePage {
	//declaration
	@FindBy(xpath="//a[contains(.,'Logout')]")
	private WebElement logOutBTN;
	
	@FindBy(xpath="//a[@id='nulltab']")
	private WebElement homeTab;
	
	@FindBy(xpath="//a[.='Leads']")
	private WebElement leadsTab;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void clickOnLogoutBTN()
	{
		logOutBTN.click();
	}
	public void clickOnHomeTab()
	{
		homeTab.click();
	}
	public void clickOnLeadsTab()
	{
		leadsTab.click();
	}
}
