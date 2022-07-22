package com.Orhrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewLoginpage 
{
	WebDriver driver;
	
	public NewLoginpage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(how=How.ID,using="txtPassword")
	WebElement password;
	
	@FindBy(how=How.CLASS_NAME,using="button")
	WebElement button;
	
	
	public void startapp(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		button.click();
	}
	
	
	
	

}
