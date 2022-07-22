package testDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling
{
public static void main(String []args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Nested
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//d.switchTo().frame(d.findElement(By.xpath("//frame[@name='frame-top']")));
	//driver.switchTo().frame(0).switchTo().frame(2);
	driver.switchTo().frame(0).switchTo().frame(0);
	String s=driver.findElement(By.tagName("body")).getText();
	System.out.println("Title is: "+s);
   // String s= d.findElement(By.tagName("body")).getText();
    System.out.println(driver.getPageSource());
    driver.switchTo().parentFrame();
    driver.switchTo().defaultContent();
    //Thread.sleep(3000);
  
    
   // d.switchTo().defaultContent();
  //d.switchTo().frame(d.findElement(By.xpath("//frame[@name='frame-bottom']")));
    driver.switchTo().frame(1);
   System.out.println(driver.getPageSource());
    Thread.sleep(3000);
//	driver.switchTo().frame(0);
//	System.out.println(driver.findElement(By.name("frame-left")).getText());
	
	
	
	
	//Simple frame
//	driver.get("https://the-internet.herokuapp.com/iframe");
//	driver.switchTo().frame(0);
//	
//	driver.findElement(By.xpath("//p")).clear();
//	driver.findElement(By.xpath("//p")).sendKeys("Hello Everyone");
	
}
}