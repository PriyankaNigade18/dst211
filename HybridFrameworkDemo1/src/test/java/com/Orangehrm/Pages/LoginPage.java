package com.Orangehrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;

	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
		
	//Locate Elements
	By username=By.name("txtUsername");
	By password=By.id("txtPassword");
	By loginbutton=By.className("button");
	
	
	
	
	
	//Methods to use Elements
	
	public void logintoApp(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(loginbutton).click();
	}
	
	
	
	
	public void getusername(String un)
	{
		driver.findElement(username).sendKeys(un);
	}
	
	public void getpassword(String psw)
	{
		driver.findElement(password).sendKeys(psw);
	}
	
	public void clickonlogin()
	{
		driver.findElement(loginbutton).click();
	}
	
}
