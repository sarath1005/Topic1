package com.bookMyShow.qa.pages;

import java.util.List;

import org.bookMyShow.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMovie extends TestBase {

	@FindBy(id="input-search-box")
	WebElement search;
	
	public SearchMovie() {
		PageFactory.initElements(driver, this);
		}
	
	public SelectMovieTiming Search(String moviename) throws InterruptedException{
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	List<WebElement> wb =driver.findElements(By.xpath("//*[@class='grid']//*[@class='__event ']"));
	for(WebElement tic : wb){
		String tick=tic.getText();
		if(tick.equals(moviename)){
			tic.click();
			//driver.findElement(By.xpath("//*[@class='grid']//*[@class='__event ' and text()='Mahanati (U)']")).click();
			break;
		}
	}
	return new SelectMovieTiming();
	
	}
}
