package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizingDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		//WebElement ptr=driver.findElement(By.xpath("//div[@id='resizable']//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		WebElement ptr=driver.findElement(By.xpath("//*[@id='resizable']//div[3]"));
		Actions act=new Actions(driver);
		//act.clickAndHold(ptr).moveToElement(ptr, 100, 120).build().perform();
		//act.clickAndHold(ptr).dragAndDropBy(ptr,10,10).build().perform();
		
		Thread.sleep(3000);
		
		act.moveToElement(ptr).dragAndDropBy(ptr,100,60).build().perform();
		
		System.out.println("Done!");
		
	}
}
