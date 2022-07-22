package testngDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshotdemo {
  @Test
  public void capture() throws IOException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	  //TakesScreenshot ts=(TakesScreenshot)driver;
	  //File temp=ts.getScreenshotAs(OutputType.FILE);
	 // File dest=new File(System.getProperty("user.dir")+"\\screenshot\\test1.png");
	  FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File(System.getProperty("user.dir")+"\\screenshot\\"+System.currentTimeMillis()+".png"));
	  
  }
}
