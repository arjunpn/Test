package com.Zoho.generic;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	//to get data from excel sheets
	public static String getData(String path, int rn, int cn, String sheetname) 
	{
		try
		{
			File file =new File(path);
			FileInputStream fis=new FileInputStream(file);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetname);
			String data=sh.getRow(rn).getCell(cn).toString();
			return data;
		}
		catch(Exception e)
		{
			return "";
		}		
	}
	
	//To get row count
	public static int getRowCount(String path, String sheetName)
	{
		try
		{
			File file =new File(path);
			FileInputStream fis=new FileInputStream(file);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			return sh.getLastRowNum();
		}
		catch(Exception e)
		{
			return 0;
		}
		
	}
	
	//To get Cell count
	public static short getCellCount(int rc, String path, String sheetName)
	{
		try
		{
			File file =new File(path);
			FileInputStream fis=new FileInputStream(file);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			return sh.getRow(rc).getLastCellNum();
		}
		catch(Exception e)
		{
			return 0;
		}
		
	}

}
