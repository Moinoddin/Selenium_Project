package com.qa.randomprojects.TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider_Check {
	
	public static InputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String str;

	public static void main(String[] args) throws IOException, InvalidFormatException {

		

		fi = new FileInputStream("./src/main/java/com/qa/dataprovider/sheet/logindata.xlsx");
		
		wb = new XSSFWorkbook(fi);
		
		ws = wb.getSheetAt(0);
		
		row = ws.getRow(0);
		
		int rw = ws.getLastRowNum();
		
		int col = row.getLastCellNum();
		
		System.out.println(rw +" "+ col);
		
		
		
		for(int i=0; i<=rw; i++)
		{
		
			for(int j=0; j<col; j++)
			{
					str = wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
					
					System.out.printf("|%-10s|", str);
			}
			
		System.out.println();	
	}
		
		wb.close();
		fi.close();
		
		

	}
	
	
	
	
	

}
