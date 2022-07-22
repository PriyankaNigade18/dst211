package testngDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData 
{
	@DataProvider(name="TestData2")
	public Object [][]dataSet() throws IOException
	  {
		  File f1=new File(System.getProperty("user.dir")+"\\dataset\\Data.xlsx");
		  FileInputStream fs=new FileInputStream(f1);
		  
		  //Workbook--->Sheet--->row--->cell
		  XSSFWorkbook ws=new XSSFWorkbook(fs);
		  
		  //Number of rows
		 int rows= ws.getSheet("userdata").getPhysicalNumberOfRows();
		  //Number of cells
		 int cells= ws.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
		  
		  Object arr[][]=new Object[rows][cells];
		  
		  for(int i=0;i<arr.length;i++)
		  {
			  for(int j=0;j<arr[i].length;j++)
			  {
				  arr[i][j]=ws.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
				  //System.out.print(arr[i][j]+" ");
			  }
			  //System.out.println();
		  }
		  return arr;

	  }
	
	
	
	
	
	

	@DataProvider(name="TestData1")
	public Object[][] dataset()
	{
		Object arr[][]= {{"admin","admin123"},{"tester1","tester123"},{"tester2","tester123"}};
		return arr;
	}
	
}
