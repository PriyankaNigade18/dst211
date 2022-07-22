package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommmands {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("software testing",Keys.ENTER);
		
		//search selenium in search box
		//1. identify element
		//locator
		//By.name("q");
//		WebElement searchbox=driver.findElement(By.name("q"));
//		
//		//verify element is displayed or enabled
//		System.out.println("Is searchbox is enabled?: "+searchbox.isEnabled());
//		System.out.println("Is seachbox is displayed?: "+searchbox.isDisplayed());
//		//2.perform action on element
//		if(searchbox.isDisplayed() && searchbox.isEnabled())
//		{
//		searchbox.sendKeys("Selenium",Keys.ENTER);
//		}
//		System.out.println("Test Passed.....");

	}

}
