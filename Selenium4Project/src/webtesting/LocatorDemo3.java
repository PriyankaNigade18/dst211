package webtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("admin");
		//Thread.sleep(3000);
		//tagnamewithid
		//driver.findElement(By.cssSelector("input#txtUsername")).clear();
		//tagnamewithattribute
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
		//tagnamewithclass
		//driver.findElement(By.cssSelector("input.button")).click();
		
		//tagname,class and attribute
		driver.findElement(By.cssSelector("input.button[type='submit']")).click();
		
	}

}
