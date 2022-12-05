package com.qa.randomprojects.TestCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

import com.qa.pages.AmazonHomepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class WebElementClick {
  
	
	WebDriver driver;
	
	
	
	public void webElementClick() throws InterruptedException 
	{
		
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  
	  AmazonHomepage ah = new AmazonHomepage(driver);
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	  
	  driver.get("https://www.amazon.in/");
	  
	  ah.TodaysDeal.click();
	  ah.mobileTab.click();
	  ah.customerservice.click();
	  ah.Electronic.click();
	  ah.Fashion.click();
	  ah.kitchen.click();
	  ah.searchDropdownBox.click();
	  ah.twotabsearchtextbox.sendKeys("woodland");
	  ah.searchsubmitbutton.click();
	    
	  
	  Thread.sleep(3000);
	  
	  driver.quit();
	  
  }
	
	@Test
	public void assertverify()
	{
		WebDriverManager.chromedriver().setup();
		  
		  driver = new ChromeDriver();
		  
		//  AmazonHomepage ah = new AmazonHomepage(driver);
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		  
		  driver.get("https://www.amazon.in/");
		  
		  String str = driver.getTitle();
		  
		  assertEquals(driver.getTitle(), str);
		  
		  driver.quit();
		  
	}
}
