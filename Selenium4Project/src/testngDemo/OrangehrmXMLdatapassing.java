package testngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangehrmXMLdatapassing 
{
	@Parameters({"un","psw"})
  @Test
  public void loginHRM(String un,String psw)
  {System.out.println("Before Class will call first");
	System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.findElement(By.id("txtUsername")).sendKeys(un);
	driver.findElement(By.id("txtPassword")).sendKeys(psw);
	driver.findElement(By.className("button")).click();
  }
}
