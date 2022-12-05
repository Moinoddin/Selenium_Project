package com.qa.randomprojects.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4jTest {
	
	WebDriver driver;
	Logger log;
	
  @Test
  public void log4jTest() {
	  
	  log = Logger.getLogger("Log4jTest");
	  PropertyConfigurator.configure("./src/main/java/com/qa/log4j/Log4j.properties");
	  
	  WebDriverManager.chromedriver().setup();
	  log.info("WebdriverManager inciating Webdriver object");
	  
	  driver = new ChromeDriver();
	  log.info("Chrome Driver object intialized to WebDriver Instance");
	  
	  driver.get("htps://amazon.in");
	  log.info("WebSite Url has loaded in Browser");
	  
	  driver.quit();
	  log.info("browser get close");
	  
	  
	  
	  
  }
}
