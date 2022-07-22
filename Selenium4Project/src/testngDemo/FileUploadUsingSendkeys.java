package testngDemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUploadUsingSendkeys
{
	@Test(enabled=false)
	public void fileUploadTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Priyanka\\Desktop\\Test1.txt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
		
		WebElement ele=driver.findElement(By.xpath("//h3//center[text()='has been successfully uploaded.']"));
		Thread.sleep(2000);
		System.out.println(ele.getText());
		
	}
	
	
	
	
	
	
	
	@Test
	public void upload() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Priyanka/Desktop/FileUpload.html");
		System.out.println("Application Open!");
		
		
		WebElement fileupload=driver.findElement(By.tagName("input"));
		//Thread.sleep(2000);

		fileupload.sendKeys("C:\\Users\\Priyanka\\Desktop\\DST211Automation.txt");
		System.out.println("File Uploaded!");
		
	}
	
	
	
	

}
