package webtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatoreDemo1 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By.name("Priyanka")).click();
		
		
		
		
		
		
		/*
		//username
		WebElement username=driver.findElement(By.id("txtUsername"));
		if(username.isDisplayed() && username.isEnabled())
		{
			username.sendKeys("admin");
		}
		//password
		WebElement psw=driver.findElement(By.name("txtPassword"));
		if(psw.isDisplayed() && psw.isEnabled())
		{
			psw.sendKeys("admin123");
			
		}
		//login button
		driver.findElement(By.className("button")).click();
		*/
		
		
		
		
		
		
		
		
		
		
	}

}
