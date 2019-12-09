package com.spicejet.PageHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.spicejet.Pages.BookingPage;
import com.spicejet.Pages.PassengersPage;
import com.spicejet.TestBase.BaseTest;
/*Author: Aditya Prasad
 *Description: This class is used to get get details from Booking.properties and creates methods for Booking.
 */
public class BookingHelper extends BaseTest {
	
	public BookingPage bp;
	public PassengersPage pp;
	
	//constructor Starting
	public BookingHelper() {
		bp=new BookingPage();
		pp=new PassengersPage();
	}//Constructor Ending
	
	public void BookTkt() throws InterruptedException {
		Thread.sleep(2000);
		WebElement h1=driver.findElement(By.xpath(bp.getHeader()));
		h1.findElement(By.xpath(bp.getBook())).click();
		System.out.println("Booking Clicked");
		driver.findElement(By.xpath(bp.getRoundtrip())).click();
		System.out.println("RoundTrip selected");
		driver.findElement(By.xpath(bp.getFrom())).click();
		driver.findElement(By.xpath(bp.getFrom())).sendKeys("Hyd");
		System.out.println("Form Selected");
		Thread.sleep(1000);
		driver.findElement(By.xpath(bp.getTo())).click();
		driver.findElement(By.xpath(bp.getTo())).sendKeys("vis");
		System.out.println("To selected");
		Thread.sleep(1000);
		driver.findElement(By.xpath(bp.getdec4())).click();
		Thread.sleep(2000);
		System.out.println("Date 1 selected");
		driver.findElement(By.xpath(bp.getDp2())).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(bp.getdec7())).click();
		System.out.println("Date 2 selected");
		Thread.sleep(2000);
		driver.findElement(By.xpath(bp.getPassengers())).click();
		Thread.sleep(1000);
		Select Adult= new Select(driver.findElement(By.xpath(bp.getadults())));
		Adult.selectByIndex(1);
		System.out.println("Adults selected");
		Select Child=new Select(driver.findElement(By.xpath(bp.getchild())));
		Child.selectByIndex(1);
		Thread.sleep(2000);
		System.out.println("Children Selected");
		Select Currency=new Select(driver.findElement(By.xpath(bp.getCurrency())));
		Currency.selectByVisibleText("INR");
		System.out.println("Currency selected");
		driver.findElement(By.xpath(bp.getSearch())).click();
		System.out.println("search clicked");
	}
	
	public void Next() {
		WebElement con= driver.findElement(By.xpath(bp.Continuehead()));
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(con));
		Actions act=new Actions(driver);
		act.moveToElement(con.findElement(By.xpath(bp.Continue()))).click();
		//con.findElement(By.xpath(bp.Continue())).click();
		System.out.println("Continue clicked");
	}
	
	public void filldetails() {
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(pp.imcontact()))));
		driver.findElement(By.xpath(pp.imcontact())).click();
		driver.findElement(By.xpath(pp.imflying())).click();
		Select id=new Select(driver.findElement(By.xpath(pp.Idtype())));
		id.selectByIndex(1);
		driver.findElement(By.xpath(pp.Idnumber())).sendKeys("868746434150");
		System.out.println("Primary passenger details provided");
	}
	
	public void fillA2() {
		Select a2=new Select(driver.findElement(By.xpath(pp.A2Title())));
		a2.selectByIndex(0);
		driver.findElement(By.xpath(pp.A2Fname())).sendKeys("QA");
		driver.findElement(By.xpath(pp.A2Lname())).sendKeys("Testing");
		System.out.println("A2 details provided");
	}
}
