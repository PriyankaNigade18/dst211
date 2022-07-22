package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");

		driver.findElement(By.xpath("//ul[@class='navList']//li//a[text()='Frames']")).click();
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame("packageListFrame");
		//packageListFrame
		//package is in frame 1
		driver.findElement(By.xpath("//ul[@title='Packages']//li//a[text()='org.openqa.selenium']")).click();
		
		//parent page
		driver.switchTo().defaultContent();
		//TakesScreenShot in frame2
		driver.switchTo().frame(1);
		//driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//ul[@title='Interfaces']//li//a//span[text()='TakesScreenshot']")).click();
		
		driver.switchTo().defaultContent();
		//Tree in frame3
		//driver.switchTo().frame(2);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[5]")).click();
		
		
		



	}

}
