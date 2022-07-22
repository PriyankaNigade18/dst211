package com.Orangehrm.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ConfigProvider
{
	Properties p1;
	public ConfigProvider()
	{
		File f1=new File(System.getProperty("user.dir")+"\\config\\config.properties");
		try {
			FileInputStream fs=new FileInputStream(f1);
			 p1=new Properties();
			 p1.load(fs);
		 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Properties not set properly");
		}
				
	}
	
	public String getBrowser()
	{
		return p1.getProperty("bname");
	}
	
	public String getUrl()
	{
		return p1.getProperty("url");
	}
	
	

}
