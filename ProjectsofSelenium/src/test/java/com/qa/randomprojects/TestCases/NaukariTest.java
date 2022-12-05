package com.qa.randomprojects.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukariTest {
  @Test
  public void naukariProfileUpdate() throws InterruptedException {

WebDriver driver;
	  
	  WebDriverManager.firefoxdriver().setup();
	  
//	  WebDriverManager.chromedriver().setup();
//	  
//	  driver = new ChromeDriver();
	  
	  driver = new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  
	  driver.navigate().to("https://www.naukri.com/");
	  
	  driver.findElement(By.cssSelector("a#login_Layer")).click();
	  
	  driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("mainuddinsarwad@gmail.com");
	  
	  driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("moin0513");
	  
	  driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
	  	  	  
	  
	  driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']/div[1]")).click();
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[contains(text(),'View & Update Profile') ]")).click();  //and @class='nI-gNb-info__sub-link'
	  
	  driver.findElement(By.xpath("//div[@class='widgetHead']/span[text()='Resume Headline']/following-sibling::span[1]")).click();
	  
	  driver.findElement(By.cssSelector("textarea#resumeHeadlineTxt")).click();
	  
	  driver.findElement(By.cssSelector("textarea#resumeHeadlineTxt")).sendKeys("  ");
	  
	  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']/div[1]")).click();

	  driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	  
	  

	  
  }
}
