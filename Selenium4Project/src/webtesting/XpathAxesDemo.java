package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String text1=driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]//following::a[text()='Best Sellers'][1]")).getText();
		System.out.println("Text os best seller link is: "+text1);
		
		String text2=driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]//preceding::span[@id='glow-ingress-line1']")).getText();
		
		System.out.println("Text of preceding text is: "+text2);
		
		
		
		
	}

}
