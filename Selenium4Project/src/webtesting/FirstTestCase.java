package webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase
{

	public static void main(String[] args)
	{
		//1.open chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//2.Open application
		driver.get("https://www.google.com");
		System.out.println("Application is Open");
		//3.Close browser
		driver.close();
		System.out.println("Application is Close");
		
		//WebDriver driver=new FirefoxDriver();
		
	

	}

}
