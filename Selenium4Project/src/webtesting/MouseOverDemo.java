package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
		driver.switchTo().frame("iframeResult");
		
		WebElement img=driver.findElement(By.xpath("/html/body/img"));
		Actions act=new Actions(driver);
		act.moveToElement(img).perform();
		System.out.println("Test Completed");
		
		
		
		
		
		
	}

}
