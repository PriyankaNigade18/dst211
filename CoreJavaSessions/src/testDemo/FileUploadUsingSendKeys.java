package testDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadUsingSendKeys 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","C:\\SelReq\\DST211\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/Priyanka/Desktop/FileUpload.html");
		WebElement ele=driver.findElement(By.tagName("input"));
		
		ele.sendKeys("C:\\Users\\Priyanka\\Desktop");
		System.out.println("Done");
		
		//driver.get("http://demo.guru99.com/test/upload/");
//		WebElement ele=driver.findElement(By.id("uploadfile_0"));
//		ele.sendKeys("C:\\Users\\Priyanka\\Desktop");
//		driver.findElement(By.id("terms")).click();
//		driver.findElement(By.id("submitbutton")).click();
		//System.out.println(driver.getTitle());
		//driver.findElement(By.name("resumeupload")).sendKeys("C:\\Users\\Priyanka\\Desktop");
	}

}
