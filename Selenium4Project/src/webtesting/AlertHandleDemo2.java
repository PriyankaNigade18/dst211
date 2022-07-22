package webtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandleDemo2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//first alert
		driver.findElement(By.xpath("//ul//li//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Alert alt1=driver.switchTo().alert();
		System.out.println("Text of alert is: "+alt1.getText());
		alt1.accept();
		
		Thread.sleep(3000);
		//Second alert
		driver.findElement(By.xpath("//ul//li//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert alt2=driver.switchTo().alert();
		System.out.println("Text of alert is: "+alt2.getText());
		alt2.dismiss();
		
		//Third alert
		
		driver.findElement(By.xpath("//ul//li//button[text()='Click for JS Prompt']")).click();
		Alert alt3=driver.switchTo().alert();
		System.out.println("Text of alert is: "+alt3.getText());
		alt3.sendKeys("Selenium Training");
		alt3.accept();
	
		
		String resulttext=driver.findElement(By.xpath("//p[contains(text(),'You entered')]")).getText();
		System.out.println("Result is: "+resulttext);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
