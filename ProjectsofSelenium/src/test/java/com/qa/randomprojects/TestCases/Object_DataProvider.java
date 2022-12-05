package com.qa.randomprojects.TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Object_DataProvider {
	
	public static InputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String str;
	public static String[][] stobj;
 
	@Test(dataProvider = "excel")
	public void data_Fetch(String st, String sp)
	{
		System.out.println(st+" "+sp);
	}
	
	
	
  @DataProvider(name = "excel")
  public Object[][] object_DataProvider() throws IOException {
	  
	  
	  
	  	fi = new FileInputStream("./src/main/java/com/qa/dataprovider/sheet/logindata.xlsx");
		
		wb = new XSSFWorkbook(fi);
		
		ws = wb.getSheetAt(0);
		
		row = ws.getRow(0);
		
		int rw = ws.getLastRowNum();
		
		int col = row.getLastCellNum();
		
		stobj = new String[rw][col];
		
		int k =0;
		for(int i=0; i<rw; i++, k++)
		{
		  int m=0;
			for(int j=0; j<col; j++, m++)
			{
					 
					 
				stobj[k][m]  = wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
					
		
			}
			
		System.out.println();	
	}
		
		wb.close();
		fi.close();
		
	  
	  return stobj;
	  
  }
}
