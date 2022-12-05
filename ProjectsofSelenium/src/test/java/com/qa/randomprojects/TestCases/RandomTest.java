package com.qa.randomprojects.TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomTest {



	@Test
	public void f() throws InterruptedException {

		WebDriver driver;

		WebDriverManager.firefoxdriver().setup();

		//WebDriverManager.chromedriver().setup();

		//driver = new ChromeDriver();

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));

		driver.navigate().to("https://www.amazon.in/");

		driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")).click();
		
		
		for(int i=1;i<44;i++)
		{
			String f="//select[@id='searchDropdownBox']/option[";
			String t="]";
			String all= f+i+t;
			
		 driver.findElement(By.xpath(all)).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath(all)).sendKeys(Keys.RETURN);
		}
		
			//	driver.quit();
		
		
		
		
		
		




	}
}
