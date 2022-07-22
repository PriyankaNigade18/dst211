package webtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//Link---xpath with text()
		String text=driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getText();
		
		System.out.println(text);
		//xpath with contains()
		driver.findElement(By.xpath("//input[contains(@id,'txtUser')]")).sendKeys("admin");
		
		//xpath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@name,'txtPas')]")).sendKeys("admin123");
		
		//xpath with ends-with()/Contains()
		driver.findElement(By.xpath("//input[contains(@class,'ton')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
