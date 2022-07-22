package testDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String parent=driver.getWindowHandle();
		System.out.println("Parent window: "+parent);
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		
		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		newTab.get("https://www.google.com");
		String child=newTab.getWindowHandle();
		System.out.println("Parent window: "+child);
		driver.findElement(By.name("q")).sendKeys("selenium");
	
		driver.close();
		driver.switchTo().window(parent);
	
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	
}

}
