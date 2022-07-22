package webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleVerification {

	public static void main(String[] args) 
	{
		//1.Open browser
		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//2.Open application
		driver.get("https://www.google.com");
		
		//3.Capture actual title from application
		String actual=driver.getTitle();
		System.out.println("Title of application is: "+actual);
		
		//4.Verify actual title with expected
		String expected="Google";
		
		if(actual.equals(expected))
		{
			System.out.println("Test case is Passed!...Title matched");
			
		}else
		{
			System.out.println("Test case is Failed!...Title not matched");
		}
		
		//5.Close browser( close()- close Current(active) window  
		//quit()-close all open windows open by selenium)
		//driver.close();
		
		

	}

}
