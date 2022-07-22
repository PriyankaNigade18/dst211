package com.Orhrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	WebDriver driver;
	
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
		By username=By.id("txtUsername");
		By password=By.name("txtPassword");
		By button=By.className("button");
		
		
		public void logintoapp(String un,String psw)
		{
			driver.findElement(username).sendKeys(un);
			driver.findElement(password).sendKeys(psw);
			driver.findElement(button).click();
		}
		public void username()
		{
			driver.findElement(username).sendKeys("admin");
		}
		public void password()
		{
			driver.findElement(password).sendKeys("admin123");
		}
		public void button()
		{
			driver.findElement(button).click();
		}
		
	
	
	
	
	
	
}
