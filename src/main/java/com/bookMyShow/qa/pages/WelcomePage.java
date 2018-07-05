package com.bookMyShow.qa.pages;

import org.bookMyShow.qa.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends TestBase {
	
	//Page Factory or OR
	@FindBy(id="inp_RegionSearch_top")
	WebElement Selectregion;
	
	@FindBy(id="inp_RegionSearch_top")
	WebElement Tab;
	
	@FindBy(id="wzrk-confirm")
	WebElement popup;
	
	@FindBy(xpath="//*[text()='Sign In']")
	WebElement signin;
	 
	//Initialize the page Objects
	public WelcomePage() {
	PageFactory.initElements(driver, this);
	}
	
	//validate page title
	public String validateWelcomePageTitle(){
        return driver.getTitle();		
	}
    
	//region 
	public LoginPage Region(String reg) throws InterruptedException{
		Selectregion.sendKeys(reg);
		Tab.sendKeys(Keys.TAB);
		Thread.sleep(10000);
		popup.click();
		signin.click();
		Thread.sleep(3000);
		return new LoginPage();

	}
	
}
