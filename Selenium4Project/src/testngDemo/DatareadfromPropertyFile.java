package testngDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DatareadfromPropertyFile {
  @Test
  public void testdata() throws IOException 
  {
	  
	  //File f1=new File(System.getProperty("user.dir")+"\\Test1.properties");
	  //FileInputStream fs=new FileInputStream(new File(System.getProperty("user.dir")+"\\Test1.properties"));
	  Properties p1=new Properties();
	  p1.load(new FileInputStream(new File(System.getProperty("user.dir")+"\\Test1.properties")));
	  System.out.println("Url is: "+p1.getProperty("url"));
	  System.out.println("Browser name is: "+p1.getProperty("bname") );
	  System.out.println("Browser version is: "+p1.getProperty("bversion"));
	  
	  
	  
	  
	  
	  
  }
}
