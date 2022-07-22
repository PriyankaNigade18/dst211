package com.Orhrm.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesDataRead
{
	Properties ps;
	
	public PropertiesDataRead()
	{
		File src=new File("./Config/cofing.properties");
		try {
			FileInputStream fs=new FileInputStream(src);
			ps=new Properties();
			ps.load(fs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
	}
	
	public String getbrowser()
	{
		return ps.getProperty("browser");
	}
	public String geturl()
	{
		return ps.getProperty("url");
	}

}
