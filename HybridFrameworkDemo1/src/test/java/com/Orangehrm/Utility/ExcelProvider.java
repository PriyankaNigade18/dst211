package com.Orangehrm.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProvider
{
	public XSSFWorkbook wb;

	//constructor created
	public ExcelProvider()
	{
		File f1 = new File(System.getProperty("user.dir")+"\\TestData\\SampleData.xlsx");
		try {
			FileInputStream fs = new FileInputStream(f1);
			wb = new XSSFWorkbook(fs);
		} catch (Exception e) {
			System.out.println("file is not available");

		}
	}

	public String getStringData(String sheet, int row, int cell) 
	{
		return wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	}

	public double getNumericData(String sheet, int row, int cell) 
	{
		return wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
	}

}

