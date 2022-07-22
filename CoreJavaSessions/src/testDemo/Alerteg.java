package testDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerteg {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		
		
		
		
		
		
//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");




		/*
		//Maximize()
		//driver.manage().window().maximize();
		//username
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		//password
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//button
		driver.findElement(By.className("button")).click();
		
		//click on PIM
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		
		driver.findElement(By.name("chkSelectRow[]")).click();
		driver.findElement(By.id("btnDelete")).click();
		Thread.sleep(2000);
//		Alert al1=driver.switchTo().alert();
//		System.out.println(al1.getText());
//		al1.accept();
		*/
		
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.findElement(By.name("proceed")).click();
//		Alert alert1=driver.switchTo().alert();
//		System.out.println("Alert is comming: "+alert1.getText());
//		alert1.accept();
//		
//		
//		driver.findElement(By.id("login1")).sendKeys("piyu1818@gmail.com");
	}

}
