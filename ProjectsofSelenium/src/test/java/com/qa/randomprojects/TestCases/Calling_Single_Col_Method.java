package com.qa.randomprojects.TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calling_Single_Col_Method {
	
	public  InputStream fi;
	public  XSSFWorkbook wb;
	public  XSSFSheet ws;
	public  XSSFRow row;
	public  XSSFCell cell;
	public  String str;
	public static int rw;
	WebDriver driver;

	@Test
	public void f() throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

		driver.get("https://www.kud.ac.in/index.php");
		
		fi = new FileInputStream("./src/main/java/com/qa/dataprovider/sheet/injection.xlsx");

		wb = new XSSFWorkbook(fi);

		ws = wb.getSheetAt(0);

		rw = ws.getLastRowNum();
		
		System.out.println(rw); 
		
		for(int i=0; i<=rw; i++)
		{

			str = wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();

			driver.findElement(By.id("txt_sh")).sendKeys(str);
			
			driver.findElement(By.id("my-search")).click();
		
			System.out.println(str);
			
			Thread.sleep(3000);
		}

		wb.close();
		fi.close();
		
	}
}
