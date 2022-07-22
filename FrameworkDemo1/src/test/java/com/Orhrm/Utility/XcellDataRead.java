package com.Orhrm.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XcellDataRead
{
	public XSSFWorkbook wb;

	//constructor created
	public XcellDataRead()
	{
		File f1 = new File(System.getProperty("user.dir")+"\\TestData\\Data.xlsx");
		try {
			FileInputStream fs = new FileInputStream(f1);
			wb = new XSSFWorkbook(fs);
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
	}

	public String getStringData(String sheet, int row, int cell) {
		return wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	}

	public double getNumericData(String sheet, int row, int cell) {
		return wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
	}

}
