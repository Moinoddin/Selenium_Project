package com.qa.randomprojects.TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleColumData {

	public  InputStream fi;
	public  XSSFWorkbook wb;
	public  XSSFSheet ws;
	public  XSSFRow row;
	public  XSSFCell cell;
	public  String str;
	WebDriver driver;
	public static int rw;

	@Test
	public void fetch_Single_Colum() throws IOException {


		fi = new FileInputStream("./src/main/java/com/qa/dataprovider/sheet/injection.xlsx");

		wb = new XSSFWorkbook(fi);

		ws = wb.getSheetAt(0);

		rw = ws.getLastRowNum();
		
		System.out.println(rw); 

		for(int i=0; i<=rw; i++)
		{

			str = wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();

			System.out.println(str);
					
		}

		
		wb.close();
		fi.close();
		
		
		

	}
	

}
