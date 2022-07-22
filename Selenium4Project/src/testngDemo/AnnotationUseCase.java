package testngDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationUseCase {
 
	static WebDriver driver;
	@Test
  public void Login()
  {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
  }
  
  @Test
  public void titlevalidation()	
  {
	  System.out.println("Title is: "+driver.getTitle());
	  String actual=driver.getTitle();
	  String expected="OrangeHRM";
	  Assert.assertEquals(actual, expected);
	  
  }
  @Test
  public void Logout()
  {
	  driver.findElement(By.partialLinkText("Welcome")).click();
	  driver.findElement(By.linkText("Logout")).click();
  }
  
  @BeforeClass
  public void setup()
  {
	  System.out.println("Before Class will call first");
	  	System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
	  	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
  }
  @AfterClass
  public void teardown()
  {
	  System.out.println("After class will call at last");
	  driver.close();
  }
  
}
