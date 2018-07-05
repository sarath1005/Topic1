package org.bookMyShow.qa.testcases;

import org.bookMyShow.qa.base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bookMyShow.qa.pages.LoginPage;
import com.bookMyShow.qa.pages.SearchMovie;
import com.bookMyShow.qa.pages.WelcomePage;

public class SearchMovieTests extends TestBase{
	LoginPage lp;
	WelcomePage wp;
	SearchMovie sm;
	
	@BeforeTest
	public void setup() throws InterruptedException{
		initialization();
		wp = new WelcomePage();
		lp = new LoginPage();
		lp=wp.Region(prop.getProperty("reg"));	
		sm=lp.loginDetails(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void search() throws InterruptedException{
		sm.Search(prop.getProperty("moviename"));
	}
	

}
