package webtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		//xpath with &&
		driver.findElement(By.xpath("//input[@name='txtUsername' and  @id='txtUsername']")).sendKeys("admin");
		
		//driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		//xpath with Or||
		driver.findElement(By.xpath("//input[@name='txtPassword' or @type='passwor']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
