 package com.qa.randomprojects.TestCases;

import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentDemo {

	public ExtentReports report;
	public ExtentTest test;
	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		//System.getProperty("user.dir")+"\\
		report = new ExtentReports("ExtentReportResults.html");
		test = report.startTest("ExteDemo");
	}

	@Test
	public void f() throws IOException {
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.co.in");
			if(driver.getTitle().equals("Google"))
			{
				test.log(LogStatus.PASS, "Navigated to the specified URL");
			}
			else
			{
				test.log(LogStatus.FAIL, "Test Failed");
				test.log(LogStatus.FAIL,test.addScreenCapture(screenShot(driver))+ "Test Failed");
				
			}
		}
	}

	
	public String screenShot(WebDriver driver) throws IOException
	{
	
		TakesScreenshot sh = (TakesScreenshot) driver;
		File source = sh.getScreenshotAs(OutputType.FILE);
		File target = new File("./" + System.currentTimeMillis()+".png");
		FileUtils.copyFile(source, target);
		String errflpath = target.getAbsolutePath();
		return errflpath;
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}

}
