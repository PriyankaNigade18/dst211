package webtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String parent1=driver.getWindowHandle();
		System.out.println("Parent 1 window is: "+parent1);
		
		WebDriver newtab=driver.switchTo().newWindow(WindowType.WINDOW);
		String parent2=driver.getWindowHandle();
		System.out.println("Parent 2 window is: "+parent2);
		newtab.get("https://www.google.com");
		newtab.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		newtab.close();
		
		driver.switchTo().window(parent1);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
