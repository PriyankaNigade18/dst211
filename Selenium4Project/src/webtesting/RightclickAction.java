package webtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickAction {

	public static void main(String[] args)
	{
//Single action if we perform then use perform()
		//multiple actions if you perform then use build().perform()
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement btn1=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		//right click action
		act.contextClick(btn1).perform();
		//see menu
		driver.findElement(By.xpath("//ul[contains(@class,'context-menu-list')]//li[contains(@class,'context-menu-item context')]//span[text()='Delete']")).click();
		
		//Handle alert
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt.getText());
		alt.accept();
		
		
		
		
		
		
		
		
		

	}

}
