package com.Orangehrm.TestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Orangehrm.Pages.BaseClass;
import com.Orangehrm.Pages.NewLoginPage;
import com.Orangehrm.Utility.Helper;

public class LoginMainTestCase extends BaseClass {

	
	
	
	@Test
	public void loginVerification()
	{		
		Reporter.log("Application login is executing", true);
		test.info("Login into application is started..");
		NewLoginPage lpage=PageFactory.initElements(driver,NewLoginPage.class);
		test.pass("Data is Passing to application");
		lpage.logintoApp(excel.getStringData("userdata", 0, 0),excel.getStringData("userdata", 0, 1));
		test.pass("Login is completed successfully");
		Helper.capture(driver);
		Reporter.log("Test Completed with Screenshot", true);
		extent.flush();
		
	}
	
	
	
	//LoginPage login_p=new LoginPage(driver);
//	login_p.logintoApp("admin","admin123");
//	System.out.println("Current url: "+driver.getCurrentUrl());
	
		
		
//		login_p.getusername("admin");
//		login_p.getpassword("admin123");
//		login_p.clickonlogin();
		
		
	

}
