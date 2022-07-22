package testDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		driver.findElement(By.xpath("//ul[@class='navList']//li//a[contains(text(),'Frames') and (@target='_top')]")).click();
		
		driver.switchTo().frame("packageListFrame");
		//1st link from frame1
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		//2nd
		driver.findElement(By.linkText("TakesScreenshot")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		//3rd
		driver.findElement(By.xpath("//ul[@class='navList']//li//a[text()='Tree'][1]")).click();
		
		
		
	}

}
