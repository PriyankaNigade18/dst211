package testngDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest1
{
	
	
	
  @Test(dataProvider="TestData1",dataProviderClass = CustomData.class)
  public void scenarioTest(String un,String psw) 
  {
	  System.out.println("User name is: "+un);
	  System.out.println("Password is: "+psw);
  }
}
