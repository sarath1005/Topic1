package org.bookMyShow.qa.testcases;

import org.bookMyShow.qa.base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bookMyShow.qa.pages.LoginPage;
import com.bookMyShow.qa.pages.SearchMovie;
import com.bookMyShow.qa.pages.SelectMovieTiming;
import com.bookMyShow.qa.pages.WelcomePage;

public class SelectMovieTimingsTests extends TestBase {
	LoginPage lp;
	WelcomePage wp;
	SearchMovie sm;
	SelectMovieTiming smt;
	
	@BeforeTest
	public void setup() throws InterruptedException{
		initialization();
		wp = new WelcomePage();
		lp = new LoginPage();
		lp=wp.Region(prop.getProperty("reg"));	
		sm=lp.loginDetails(prop.getProperty("username"), prop.getProperty("password"));
		smt=sm.Search(prop.getProperty("moviename"));
	}
	
	@Test(priority=1)
	public void selectdate(){
		smt.selectDate(prop.getProperty("date"));
	}
	@Test(priority=2)
	public void  selectTheatreTiming(){
		smt.selectTheatre(prop.getProperty("theatre"), prop.getProperty("time"));
	}
	

}
