package testDemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FileUploadAutoIT
{

	@Test
	public void test1() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/upload");
		Reporter.log("Allication is Started....",true);
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//input[@name='file']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().build().perform();
		Reporter.log("File Upload window is opend",true);
		Runtime.getRuntime().exec("C:\\Users\\Priyanka\\Desktop\\AutoITScript\\Fileupload2.exe");
		Reporter.log("File Uploaded!",true);
		driver.findElement(By.className("button")).click();
	}

}
