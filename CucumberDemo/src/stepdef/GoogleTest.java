package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class GoogleTest
{
	 static WebDriver driver;
	@Given("^Open google applictaion$")
	public void open_google_applictaion() throws Throwable
	{
	    System.out.println("Application is OPen");
	    System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com");
	}

	@When("^User enter valid keyword in search box and go for search$")
	public void user_enter_valid_keyword_in_search_box_and_go_for_search() throws Throwable {
	    System.out.println("User searched keyword");
	   driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	}

	@Then("^Application should display valid result$")
	public void application_should_display_valid_result() throws Throwable {
	    System.out.println("Result displayed!");
	    System.out.println("current url is: "+driver.getCurrentUrl());
			
	
	}


}
