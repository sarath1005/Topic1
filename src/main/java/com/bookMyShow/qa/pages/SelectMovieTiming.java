package com.bookMyShow.qa.pages;

import java.util.List;

import org.bookMyShow.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SelectMovieTiming extends TestBase {

	public SelectMovieTiming() {
		PageFactory.initElements(driver, this);
		}
	public SelectsSeats selectDate(String date){
		driver.findElement(By.xpath("//*[@id='showDates']//*[text()='"+date+"']")).click();
		return new SelectsSeats();
	}
	public SelectsSeats selectTheatre(String theaterName,String time){
		List<WebElement> thList=driver.findElements(By.xpath("//*[@id='venuelist']//*[@class='__venue-name']"));
		for(WebElement Thlist : thList){
			String TheaterList=Thlist.getText();
			if(TheaterList.equals(theaterName)){
				driver.findElement(By.xpath("//*[@id='venuelist']//*[contains(text(),'"+time+"')]")).click();
				break;
			}
		}
		return new SelectsSeats();
	}
	
}
