package org.bookMyShow.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.bookMyShow.qa.base.TestBase;
import org.bookMyShow.qa.util.TestUtil;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bookMyShow.qa.pages.LoginPage;
import com.bookMyShow.qa.pages.WelcomePage;

public class WelcomePageTests extends TestBase {
	WelcomePage wp;
	LoginPage lp;
	public WelcomePageTests() {
		super();
	}
	@BeforeTest
	public void setup(){
		initialization();
		wp = new WelcomePage();
	}
	
	
	@Test(priority=1)
	public void regionTest() throws InterruptedException{
		wp.Region(prop.getProperty("reg"));	
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_timeout, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}
	
	
/*@AfterTest
public void tearDown(){
	driver.quit();
}*/
}
