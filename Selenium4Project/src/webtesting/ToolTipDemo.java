package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//input[@id='age']"));
		act.moveToElement(ele).perform();
		String text=driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
		System.out.println("Tooltip text is: "+text);
	}

}
