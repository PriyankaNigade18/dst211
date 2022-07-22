package testngDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest
{
  @Test(priority=1)
  public void userRegistration() 
  {
	  System.out.println("This is User registration");
  }
  
  @Test(priority=2)
  public void userLogin()
  {
	  System.out.println("This is user login");
  }
  
  
  
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("This will call before test");
  }
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("This will call after test");
	  
  }
  @BeforeTest
  public void btest()
  {
	  System.out.println("This will call before all classes");
  }
  
  @AfterTest
  public void atest()
  {
	  System.out.println("This will call after class");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("Before class called before 1st method");
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("After class will call after last method");
  }
  
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("Thank you for Choosing application");
  }
  
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("Welcome to our application");
  }
  
  
  
  }
