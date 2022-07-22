package testngDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XcellDataSetPassing {
  @Test
  public void dataSet() throws IOException
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
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	 String value= ws.getSheet("userdata").getRow(0).getCell(0).getStringCellValue();
//	  System.out.println(value);
//	  
	  
	  
	  
	  
	  
	  
//	 XSSFSheet sheet1= ws.getSheet("userdata");
//	 XSSFRow row1= sheet1.getRow(0);
//	 XSSFCell cell1= row1.getCell(0);
//	 System.out.println(cell1.getStringCellValue());
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
