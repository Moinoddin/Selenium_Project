package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomepage {
	
	WebDriver driver;
	
	public AmazonHomepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Mobiles')]") public  WebElement mobileTab;
	@FindBy(xpath="//a[contains(@href,'/deals?ref_=nav_cs_gb')]") public WebElement TodaysDeal;
	@FindBy(xpath="//div[@id='nav-xshop']") public  WebElement customerservice;
	
	@FindBy(xpath="//a[normalize-space()='Electronics']") public WebElement Electronic;
	@FindBy(xpath="//a[normalize-space()='Home & Kitchen']") public  WebElement kitchen;
	@FindBy(xpath="//a[normalize-space()='Fashion']") public WebElement Fashion ;
	
	@FindBy(xpath="//select[@id='searchDropdownBox']") public  WebElement searchDropdownBox;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") public WebElement twotabsearchtextbox ;
	@FindBy(xpath="//input[@id='nav-search-submit-button']") public WebElement searchsubmitbutton ;
	
	
		
	
	

}
