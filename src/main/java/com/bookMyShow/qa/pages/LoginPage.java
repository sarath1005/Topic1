package com.bookMyShow.qa.pages;

import org.bookMyShow.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase{
	
	@FindBy(id="iUserName")
	WebElement username;
	
	@FindBy(id="iPwd")
	WebElement password;
	
	@FindBy(xpath="//*[@class='submit-form']")
	WebElement submit;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		}
	
	public SearchMovie loginDetails(String un,String pass){
		username.sendKeys(un);
		password.sendKeys(pass);
		submit.click();
		return new SearchMovie();
		
	}

}
