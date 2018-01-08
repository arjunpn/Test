package com.Zoho.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeTest
	public void preCondition()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://169.254.29.18:8080/crm/HomePage.do");
		
	}
	
	@AfterTest
	public void postCondition()
	{
		driver.close();
	}

}
