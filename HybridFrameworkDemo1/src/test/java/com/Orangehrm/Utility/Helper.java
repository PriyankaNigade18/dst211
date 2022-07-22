package com.Orangehrm.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper 
{
	//screenshot,frame,windows,tabs
	public static void capture(WebDriver driver)
	{
		//TakesScreenshot ts=(TakesScreenshot)driver;
		//File temp=ts.getScreenshotAs(OutputType.FILE);
		//File dest=new File(System.getProperty("user.dir")+"\\Screenshot\\test1.png");
		
		try {
			FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File(System.getProperty("user.dir")+"\\Screenshot\\test1.png"));
		} catch (IOException e) {
		
			
		}
	}
	
	
	

}
