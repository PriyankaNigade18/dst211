package com.Orangehrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewLoginPage
{
	 WebDriver driver;
	
	//Initialize webDriver
	public NewLoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	//Locator---@FindBy
	@FindBy(name="txtUsername")
	WebElement username;
	
	
	@FindBy(how=How.ID,using="txtPassword")
	WebElement password;
	
	@FindBy(className="button")
	WebElement loginbutton;
	
	
	public void logintoApp(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginbutton.click();
	}
	

}
