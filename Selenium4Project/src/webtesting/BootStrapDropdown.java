package webtesting;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class BootStrapDropdown {

	public static void main(String[] args) throws WebDriverException, IOException
	{

		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		Utility.Screenshot(driver);
		//dropdown
		driver.findElement(By.id("menu1")).click();
		Utility.Screenshot(driver);
		List<WebElement> dd=driver.findElements(By.xpath("//ul[@class='dropdown-menu test' and @aria-labelledby='menu1']//li[@role='presentation']//a"));
		System.out.println("Total elements: "+dd.size());
		
		for(WebElement i:dd)
		{
			System.out.println(i.getText());
			Utility.Screenshot(driver);
			if(i.getText().equals("JavaScript"))
			{
				System.out.println("Test Passed....");
				break;
			}
		}






	}

}
