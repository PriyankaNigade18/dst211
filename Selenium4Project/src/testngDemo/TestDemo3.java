package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3 {
  @Test(priority = 1, description = "Test case 1")
  public void one()
  {
	  System.out.println("This is first test case");
  }
  
  @Test(priority=2,description = "Test Case 2",enabled=false)
  public void two()
  {
	  System.out.println("This is Second test case");
  }
  
  @Test(priority=3,description = "Test Case 3",invocationCount = 2)
  public void three()
  {
	  System.out.println("This is third test case");
	  
  }
}
