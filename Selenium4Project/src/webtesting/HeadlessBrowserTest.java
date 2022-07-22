package webtesting;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.setHeadless(true);
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("admin");
		System.out.println("User name entered");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
		System.out.println("Password entered");
		driver.findElement(By.cssSelector("input.button[type='submit']")).click();
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
//		ChromeDriver driver=new ChromeDriver();
//		Capabilities cap=driver.getCapabilities();
//		Map<String,Object> map=cap.asMap();
//		System.out.println(map);
		
		
		
	}

}
