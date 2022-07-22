package com.Orhrm.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Helper
{ 
	
	
	public static void capture(WebDriver driver)
	{
		
		//TakesScreenshot ts=(TakesScreenshot)driver;
		//File src=ts.getScreenshotAs(OutputType.FILE);
		//File dest	=new File("./Screenshot/"+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("./Screenshot/"+System.currentTimeMillis()+".png"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
