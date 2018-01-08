package com.Zoho.test;

import org.testng.annotations.Test;

import com.Zoho.generic.BaseTest;
import com.Zoho.generic.ExcelData;
import com.Zoho.pages.HomePage;
import com.Zoho.pages.LoginPage;

public class TestValidLoginLogout extends BaseTest {
	
	@Test
	public void validLoginLogoutTest() throws InterruptedException
	{
		String loginTitle=ExcelData.getData(path, 1, 3, "LoginPage");
		String userName=ExcelData.getData(path, 1, 1, "LoginPage");
		String password=ExcelData.getData(path, 1, 2, "LoginPage");
		String homePageTitle=ExcelData.getData(path, 1, 0, "HomePage");
				
		LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);
		
		lp.verifyingTitle(loginTitle);
		lp.enterUserName(userName);
		lp.enterPassword(password);
		lp.clickOnSignin();
		lp.verifyingTitle(homePageTitle);
		hp.clickOnLogoutBTN();
		lp.VerifyTitle(loginTitle);
	}
}
