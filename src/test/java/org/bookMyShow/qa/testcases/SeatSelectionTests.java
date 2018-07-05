package org.bookMyShow.qa.testcases;

import org.bookMyShow.qa.base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bookMyShow.qa.pages.LoginPage;
import com.bookMyShow.qa.pages.SearchMovie;
import com.bookMyShow.qa.pages.SelectMovieTiming;
import com.bookMyShow.qa.pages.SelectsSeats;
import com.bookMyShow.qa.pages.WelcomePage;

public class SeatSelectionTests extends TestBase {
	LoginPage lp;
	WelcomePage wp;
	SearchMovie sm;
	SelectMovieTiming smt;
	SelectsSeats ss;
	
	public SeatSelectionTests() {
		super();
	}
	@BeforeTest
	public void setup() throws InterruptedException{
		initialization();
		wp = new WelcomePage();
		lp = new LoginPage();
		//sm =new SearchMovie();
		//smt= new SelectMovieTiming();
		//ss =new SelectsSeats();
		lp=wp.Region(prop.getProperty("reg"));	
		sm=lp.loginDetails(prop.getProperty("username"), prop.getProperty("password"));
		smt=sm.Search(prop.getProperty("moviename"));
		ss=smt.selectDate(prop.getProperty("date"));
		Thread.sleep(3000);
		ss=smt.selectTheatre(prop.getProperty("theatre"), prop.getProperty("time"));
	}
	@Test(priority=1)
	public void selectNoOfSeat() throws InterruptedException{
		ss.NoOfSeats(prop.getProperty("NoOfSeats"));
	}
	@Test(priority=2)
	public void selectseat() throws InterruptedException{
		ss.selectSeat(prop.getProperty("row"), prop.getProperty("seatNo"));
	}
}
