package webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get(url)==> to open application
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//To capture title use getTitle()
		System.out.println("Application title is: "+driver.getTitle());
		
		//To capture current url of application getCurrentUrl()
		System.out.println("Current url is: "+driver.getCurrentUrl());
		
		//To capture page source---> getPageSource()
		//System.out.println(driver.getPageSource());
		
		//driver.close();
		//Navigate
		
		driver.navigate().to("https://www.google.com");
		System.out.println("Google app title is: "+driver.getTitle());
		//to go back---back()
		driver.navigate().back();//hrm
		
		//to go forward--forward()
		driver.navigate().forward();//google
		
		//to refresh page---refresh()
		driver.navigate().refresh();//google
		System.out.println("Navigations commands Demo completed....");

	}

}
