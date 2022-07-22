package testDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker
{
	public static void dropd(List<WebElement> options,String value)
	{
		//List<WebElement> options=w;
		
		System.out.println("Total Elements: "+options.size());
		for(WebElement i:options)
		{
			//System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				System.out.println("Match Found.....");
				break;
			}
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		
		//Checkbox
//		driver.findElement(By.xpath("//label[@class='gr-checkbox-label']//span[text()='Student Fare']")).click();
//		System.out.println("Checkbox clicked....");
		
		//fromdd
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("p");
		//List
		List<WebElement> options=driver.findElements(By.xpath("//ul[@id='react-autosuggest-1']//li[contains(@id,'react-autosuggest-1')]//div[@class='mainTxt clearfix']//span"));
		dropd(options,"Pune");
		
		//departure
	
		driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']")).sendKeys("d");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='react-autosuggest-1']//li[contains(@id,'react-autosuggest-1')]//div[@class='mainTxt clearfix']"));
		dropd(list,"Delhi");
		
		//calendar
		driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
		//driver.findElement(By.xpath("//div[@class='DayPicker-Day']//div[text()='30']")).click();
		String month="March";
		String year="2022";
		String date="20";
		
		while(true)
		{
		String text=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']//div")).getText();
		System.out.println(text);
		String arr[]=text.split(" ");
		String mon=arr[0];
		String yer=arr[1];
			
		if(mon.equals(month) && yer.equals(year))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month' and @role='button']")).click();
		}
		}
		
		
		//date
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		for(WebElement i:dates)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
