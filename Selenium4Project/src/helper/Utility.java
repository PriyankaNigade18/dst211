package helper;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{

	public static void Screenshot(WebDriver driver) throws WebDriverException, IOException
	{
		  FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File(System.getProperty("user.dir")+"\\screenshot\\"+System.currentTimeMillis()+".png"));

	}
	
	
}
