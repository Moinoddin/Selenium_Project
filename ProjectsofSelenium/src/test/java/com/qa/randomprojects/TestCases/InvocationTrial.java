package com.qa.randomprojects.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationTrial {
	
  WebDriver driver;
  @Test(invocationCount = 3)
  
  public void f() {
	  
	  	WebDriverManager.chromedriver().setup();
	  
	  	
	  	driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1) );
		
		driver.navigate().to("https://amazon.in");
		
		
		
		driver.quit();
		
	  
  }
}
