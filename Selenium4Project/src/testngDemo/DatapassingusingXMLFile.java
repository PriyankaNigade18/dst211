package testngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DatapassingusingXMLFile 
{
	@Parameters({"un","psw"})
  @Test
  public void testdata(String un,String psw)
  {
	  
	  System.out.println("User name is: "+un);
	  System.out.println("Pssword is: "+psw);
	  
	  
  }
}
