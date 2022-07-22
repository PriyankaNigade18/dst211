package testDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("http://www.dhtmlgoodies.com/scripts/drag drop custom/demo drag drop 3.html");
		driver.get("http://jqueryui.com/droppable/#default");	
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		
		
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
//		act.clickAndHold(src).perform();
//		act.moveToElement(dest).release().build().perform();
		
		act.dragAndDrop(src, dest).build().perform();
		System.out.println("Test completed....");
		
		
		
		
		
		
	}

}
