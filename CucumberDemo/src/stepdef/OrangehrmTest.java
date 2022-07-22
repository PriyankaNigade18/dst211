package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.*;

public class OrangehrmTest {
  
	static WebDriver driver;
	@Given("^Open Orangehrm application in chrome$")
	public void open_Orangehrm_application_in_chrome() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","C:\\SelReq\\DST211\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    
	}

	@When("^User enters valid \"([^\"]*)\" & valid \"([^\"]*)\"$")
	public void user_enters_valid_valid(String arg1, String arg2) throws Throwable 
	{
	    driver.findElement(By.id("txtUsername")).sendKeys(arg1);
	    driver.findElement(By.id("txtPassword")).sendKeys(arg2);
	}

	@When("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
	    driver.findElement(By.className("button")).click();
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	    //System.out.println(driver.getCurrentUrl());
		String actual=driver.getCurrentUrl();
		String expected="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actual, expected);
	}


}
