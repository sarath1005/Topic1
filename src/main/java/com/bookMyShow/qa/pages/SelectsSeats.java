package com.bookMyShow.qa.pages;

import org.bookMyShow.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectsSeats extends TestBase{
	
	@FindBy(id="btnPopupAccept")
	WebElement AcceptPopup;
	
	@FindBy(id="proceed-Qty")
	WebElement submitButton;
	
	public SelectsSeats() {
		PageFactory.initElements(driver, this);
		}
	
	public Payment NoOfSeats(String seat) throws InterruptedException{
		AcceptPopup.click();
		System.out.println("Getting ready");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='popQty']//li[@class='_active']")).click();
		driver.findElement(By.xpath("//*[@id='popQty']//li[contains(text(),'"+seat+"')]")).click();
		submitButton.click();
		return new Payment();
	}
	
	public Payment selectSeat(String row,String seatNo) throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@class='seat-container']//div[@class='seatR Setrow1' and contains(text(),'"+row+"')]"
				+ "//parent::td//following-sibling::td//a[@class='_available' and contains(text(),'"+seatNo+"')]")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='btmcntbook']")).click();
		return new Payment();
	}
	
}
