package webtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealAppGoibibo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		
		//Checkbox
		driver.findElement(By.xpath("//label[@class='gr-checkbox-label']//span[text()='Student Fare']")).click();
		System.out.println("Checkbox clicked....");
		/*
		//fromdd
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("p");
		//List
		List<WebElement> options=driver.findElements(By.xpath("//ul[@id='react-autosuggest-1']//li[contains(@id,'react-autosuggest-1')]//div[@class='mainTxt clearfix']//span"));
		
		System.out.println("Total Elements: "+options.size());
		for(WebElement i:options)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Pune"))
			{
				i.click();
				System.out.println("Match Found.....");
				break;
			}
		}
		*/
		
		
		
		
		
		
		
	}

}
