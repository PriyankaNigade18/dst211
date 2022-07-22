package com.Orhrm.TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Orhrm.Pages.BaseClass;
import com.Orhrm.Pages.LoginPage;
import com.Orhrm.Pages.NewLoginpage;
import com.Orhrm.Utility.Helper;
import com.Orhrm.Utility.XcellDataRead;

public class LoginPageTest extends BaseClass
{
		
	@Test
	public void verifyLogin()
	{
		
		NewLoginpage nlogin=PageFactory.initElements(driver,NewLoginpage.class);
		test.info("Starting application");
		nlogin.startapp(xs.getStringData("Loginpage", 0, 0),xs.getStringData("Loginpage", 0, 1));
		test.pass("Login pass");
		extent.flush();
		Helper.capture(driver);
		
//		LoginPage loginp=new LoginPage(driver);
//		loginp.logintoapp("admin","admin123");
//		
		
//		loginp.username();
//		loginp.password();
//		loginp.button();

	}
	
	

}
