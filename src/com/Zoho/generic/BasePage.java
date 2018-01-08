package com.Zoho.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;

	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}

	//To Verify the Title
	public void VerifyTitle(String eTitle)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 40);
			System.out.println(driver.getTitle());
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is Matching",true);
		
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching");
			Assert.fail();			
		}
	}
	
	//To verify Web Element
	public void verifyElement(WebElement element)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not matching",true);
			Assert.fail();
		}
		
	
	}

}
