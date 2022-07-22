package testngDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orangehrmvalidation
{
  @Test(dataProvider="TestData2",dataProviderClass=CustomData.class)
  public void Loginhrm(String un,String psw) 
  {	System.out.println("Before Class will call first");
	System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.findElement(By.id("txtUsername")).sendKeys(un);
	driver.findElement(By.id("txtPassword")).sendKeys(psw);
	driver.findElement(By.className("button")).click();
	//System.out.println("Current url is: "+driver.getCurrentUrl());
	 String expected="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	 String actual=driver.getCurrentUrl();
	 Assert.assertEquals(actual, expected);
	 
  }
}
