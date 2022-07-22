package webtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		WebElement link=driver.findElement(By.xpath("//a//h3"));
		WebElement wait=new WebDriverWait(driver,Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(link));
		System.out.println(link.getText());
		
	}

}
