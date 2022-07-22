package testDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdd {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("p");
		
		List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@id='react-autosuggest-1']//li[contains(@id,'react-autosuggest-1')]//div[@class='mainTxt clearfix']//span"));
		System.out.println("Total elements: "+alloptions.size());
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().equals("Pune, India"))
			{
				i.click();
				System.out.println("Test passed..");
				break;
			}
		}
		
		
		
		
		
		
		
	}

}
