package webtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownElement {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
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
		
		//Employee Status
		
		Select empstatus=new Select(driver.findElement(By.id("empsearch_employee_status")));
		empstatus.selectByIndex(3);//Full-Time Permanent
		
		//Test case 1: check status for multiple selection
		System.out.println("Is dropdown support mutltiple selection: "+empstatus.isMultiple());
		
		//Test case2: Count and Print all the element of drop down
		List<WebElement> alloptions=empstatus.getOptions();
		System.out.println("Total element of drop down: "+alloptions.size());
		//To capture text of options
		for(WebElement i:alloptions)
		{
			//System.out.println(i.getText());
			String expected="Part-Time Contract";
			String actual=i.getText();
			if(actual.equals(expected))
			{
				System.out.println(i.getText());
				i.click();
				System.out.println("Match found ...Test Passed...");
				break;
			}
		}
		
		
		
		
//		Thread.sleep(3000);
//		//Job title
//		Select jobdd=new Select(driver.findElement(By.id("empsearch_job_title")));
//		jobdd.selectByValue("26");//Automation Tester
//		
//		Thread.sleep(3000);
//		//sub unit
//		Select subdd=new Select(driver.findElement(By.id("empsearch_sub_unit")));
//		subdd.selectByVisibleText("Engineering");
		
		
		
		
		
		

	}

}
