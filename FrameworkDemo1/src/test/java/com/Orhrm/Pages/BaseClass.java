package com.Orhrm.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.Orhrm.TestCases.BrowserFactory;
import com.Orhrm.Utility.Helper;
import com.Orhrm.Utility.PropertiesDataRead;
import com.Orhrm.Utility.XcellDataRead;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	public WebDriver driver;
	 public XcellDataRead xs;
	 public PropertiesDataRead pr;
	 public ExtentReports extent;
	 public ExtentSparkReporter spark;
	 public ExtentTest test;
	 
	 
	@BeforeSuite
	public void configsetup()
	{
		Reporter.log("Settin up configuration and Test Data",true);
		 xs=new XcellDataRead();
		 pr=new PropertiesDataRead();
		 extent = new ExtentReports();
		 spark = new ExtentSparkReporter("./Reports/"+System.currentTimeMillis()+".html");
		 extent.attachReporter(spark);
		 test=extent.createTest("LoginPageTest");
		 
		//ExtentTest test= extent.createTest("MyFirstTest");
		
	       
		Reporter.log("Setting done!", true);
	}
	
	@AfterSuite
	public void reports()
	{
			
	}
	
	@BeforeClass
	public void startup()
	{
		Reporter.log("Browser and Application started", true);
		 driver=BrowserFactory.startApp(pr.getbrowser(),pr.geturl());
	}
	
	@AfterClass
	public void teardown()
	{
		BrowserFactory.close();
		Reporter.log("Browser close", true);
	}
}
