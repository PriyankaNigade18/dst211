package webtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//Total element available on to web page
		
		//Test case1: To count total number of text boxes
		List<WebElement> textbox=driver.findElements(By.tagName("input"));
		System.out.println("Total text boxes are: "+textbox.size());
		
		//Test Case 2: To count total number of Links
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links are: "+Links.size());
		
		for(WebElement i:Links)
		{
			String exp="https://www.naukri.com/top-company-jobs";
			//String text=i.getText();
			String act=i.getAttribute("href");
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
			if(act.equals(exp))
			{
				//i.click();
				System.out.println("Link found test passed");
				break;
			}
			
		}
		

	}

}
