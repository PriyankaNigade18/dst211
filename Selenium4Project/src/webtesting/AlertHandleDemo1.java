package webtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandleDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Button
		driver.findElement(By.name("proceed")).click();
		//To handle alert--Alert is interface 
//		Alert alt1=driver.switchTo().alert();
//		System.out.println("Text of Alert is: "+alt1.getText());
//		alt1.accept();
		driver.switchTo().alert().accept();
		
		//User name
		driver.findElement(By.id("login1")).sendKeys("Priyanka");
		
	}

}
