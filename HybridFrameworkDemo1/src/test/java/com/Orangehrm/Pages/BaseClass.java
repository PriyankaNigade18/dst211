package com.Orangehrm.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.Orangehrm.Utility.BrowserProvider;
import com.Orangehrm.Utility.ConfigProvider;
import com.Orangehrm.Utility.ExcelProvider;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass
{
	public WebDriver driver;
	public ExcelProvider excel;
	public ConfigProvider c1;
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	@BeforeSuite
	public void setupconfig()
	{
		Reporter.log("Application configuration setup is started",true);
		excel=new ExcelProvider();
		c1=new ConfigProvider();
		extent = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\target\\LoginTest1.html");
		extent.attachReporter(spark);
		test=extent.createTest("loginVerification");

		Reporter.log("Application configuration setup is completed",true);
	}
	
	
	
	@BeforeClass
	public void browsersetup()
	{
		Reporter.log("Browser and Application started",true);
		
	 driver=BrowserProvider.setupBrowser(c1.getBrowser(),c1.getUrl());
	}
	
	@AfterClass
	public void teardown()
	{
		Reporter.log("Bowser is closing",true);
		BrowserProvider.quitbrowser();
	}
		
		

}
