package testDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get(url)==> to open application
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		WebElement admin=driver.findElement(By.xpath("//b[text()='Admin']"));
		WebElement um=driver.findElement(By.xpath("//ul//li//a[text()='User Management']"));
		WebElement user=driver.findElement(By.xpath("//ul//li//a[text()='Users']"));
		
		Actions act=new Actions(driver);
//		act.moveToElement(admin).perform();
//		act.moveToElement(um).perform();
//		act.moveToElement(user).click().perform();
		
		
		act.moveToElement(admin).moveToElement(um).moveToElement(user).click().build().perform();
		
		
		
	}

}
