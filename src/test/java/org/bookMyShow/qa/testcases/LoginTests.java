package org.bookMyShow.qa.testcases;

import org.bookMyShow.qa.base.TestBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bookMyShow.qa.pages.LoginPage;
import com.bookMyShow.qa.pages.WelcomePage;

public class LoginTests extends TestBase {
	LoginPage lp;
	WelcomePage wp;
	public LoginTests() {
       super();
    	}
	
	@BeforeTest
	public void setup() throws InterruptedException{
		initialization();
		wp = new WelcomePage();
		lp=wp.Region(prop.getProperty("reg"));	
	}
	
	@Test
	public void logincheck() throws InterruptedException{
		lp.loginDetails(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	/*@AfterTest
	public void tearDown(){
		driver.quit();
	}
*/
}
