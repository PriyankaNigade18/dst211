package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top").switchTo().frame(0);
		//driver.switchTo().frame(0);
		WebElement text1=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
		System.out.println("Text is: "+text1.getText());
		System.out.println(driver.getPageSource());

		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		String text=driver.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println("Middle frame text is: "+text);
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top").switchTo().frame("frame-right");
		String rtext=driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
		System.out.println("Text is: "+rtext);
		
		
		
		//bottom frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		String btext=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println("Bottom text is: "+btext);
		
		
		
		
		
	}

}
