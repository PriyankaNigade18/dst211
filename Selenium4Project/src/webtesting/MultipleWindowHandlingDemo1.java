package webtesting;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandlingDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//		String parent=driver.getWindowHandle();		
//		System.out.println("Parent window id is: "+parent);
		
		driver.findElement(By.name("txtUsername")).sendKeys("admin1");
		
		driver.findElement(By.xpath("//a[@href='http://www.linkedin.com/groups?home=&gid=891077']")).click();
//		Set<String> allwindows=driver.getWindowHandles();
//		System.out.println("Total windows are: "+allwindows.size());
//		System.out.println(allwindows);
//		for(String child:allwindows)
//		{
//			if(!parent.equals(child))
//			{
//				driver.switchTo().window(child);
//				driver.findElement(By.id("email-or-phone")).sendKeys("piyu1818@gmail.com");
//				//driver.close();//Only active window will get close
//				//driver.quit();//Close all open windows by selenium
//			}
//		}
//		
//		driver.switchTo().window(parent);
//		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.className("button")).click();
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
