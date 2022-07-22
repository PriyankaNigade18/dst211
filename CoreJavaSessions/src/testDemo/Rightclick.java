package testDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement btn=driver.findElement(By.xpath("//span[text()='right click me']"));
	
		Actions act=new Actions(driver);
		act.contextClick(btn).build().perform();
		
		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[contains(@class,'context-menu-item')]//span[text()='Cut']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
	}

}
