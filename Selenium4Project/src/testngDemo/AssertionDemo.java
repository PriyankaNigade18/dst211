package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void hardAssert()
  {
	  String actual="Selenium Is WebUI Automation Tool";
	  String expected="Priyanka";
	  //Assert.assertEquals(actual, expected);
	  //Assert.assertTrue(actual.equals(expected));
	  //Assert.assertTrue(actual.contains(expected));
	  Assert.assertFalse(actual.contains(expected));
	  System.out.println("Hard Assert Demo Completed!");
	  
	  }
  
  
  
  
  @Test
  public void softAssert()
  {
	  SoftAssert sobj=new SoftAssert();
	  String actual="Welcome Everyone";
	  String expected="Selenium";
	  
	  //sobj.assertEquals(actual, expected);
	  //sobj.assertTrue(actual.contains(expected));
	  sobj.assertFalse(actual.contains(expected));
	  System.out.println("Soft Assert Demo Completed!");
	  
	  sobj.assertAll();
	  
	  
	  
	  
	  
  }
  
}
