package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/#default");
		
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
//		act.clickAndHold(src).perform();
//		act.moveToElement(dest).release().build().perform();
		//act.clickAndHold(src).moveToElement(dest).release().build().perform();
		
		act.dragAndDrop(src, dest).build().perform();
		
		
		
		
		
		
		
		
	}

}
