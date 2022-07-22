package testngDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDemo2
{
	
	@Test
	public void chromeTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title is: "+driver.getTitle());
		
		
	}
	
	@Test
	public void firefoxTest()
	{
		System.setProperty("webdriver.gecko.driver","C:\\SelReq\\DST211\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Title is: "+driver.getTitle());
		
	}
	
	
	
	@Test
	public void edgeTest()
	{
		System.setProperty("webdriver.edge.driver","C:\\SelReq\\DST211\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("Title is: "+driver.getTitle());
		
	}
	

}
