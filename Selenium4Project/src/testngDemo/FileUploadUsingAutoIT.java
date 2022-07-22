package testngDemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FileUploadUsingAutoIT {
  @Test
  public void fileupload() throws IOException
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Reporter.log("Bowser is loaded",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Priyanka/Desktop/FileUpload.html");
		Reporter.log("Application is opened",true);
		WebElement ele=driver.findElement(By.name("fileupload"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().build().perform();
		
		Reporter.log("Window is opened",true);
		Runtime.getRuntime().exec("C:\\Users\\Priyanka\\Desktop\\AutoITScript\\CustomFileUpload.exe");
		Reporter.log("File Uploaded!",true);
		
		
		
		
		
		
		
	  
  }
}
