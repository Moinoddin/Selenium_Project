package com.qa.randomprojects.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Types_Of_Refresh {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	WebDriverManager.chromedriver().setup();
	  
	  	
	  	driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1) );
		
		driver.navigate().to("https://amazon.in");
		driver.navigate().refresh();
		driver.get("https://amazon.in");
		driver.getCurrentUrl();
  }
}
