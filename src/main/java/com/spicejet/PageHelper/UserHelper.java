package com.spicejet.PageHelper;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.spicejet.Pages.GenericPage;
import com.spicejet.Pages.Homepage;
import com.spicejet.Pages.LoginPage;
import com.spicejet.TestBase.BaseTest;

/*Author: Aditya Prasad
 *Description: This class is used to get get details from Properties and creates methods for login.
 */
public class UserHelper extends BaseTest {
	public GenericPage gp;
	public LoginPage lp;
	public Homepage hp;
	public static WebDriver driver;
	//Constructor starting
	public UserHelper() {
		gp= new GenericPage();
		lp=new LoginPage();
		hp=new Homepage();
	}//constructor ending

	public void BrowserInit() {

		driver=initialization(gp.getbrowser());
		browsersettings();
		driver.get(gp.geturl());
	}

	public void login() {
		driver.findElement(By.xpath(lp.getCountry())).click();
		driver.findElement(By.xpath(lp.getCountry())).sendKeys("Canada",Keys.ENTER);
		System.out.println("Canada selected");
		driver.findElement(By.xpath(lp.getusername())).sendKeys(gp.getusername());
		System.out.println("User Name Entered");
		driver.findElement(By.xpath(lp.getpassword())).sendKeys(gp.getpassword());
		System.out.println("Password Entered");
		driver.findElement(By.xpath(lp.getloginbutton())).click();
		System.out.println("Login Clicked");
	}

	public void Verifylogin() {
		String s=driver.findElement(By.xpath(lp.getwelcome())).getText();
		System.out.println(s);
		assertEquals(s,"Hi ADITYA PRASAD , Welcome to the SpiceClub!");
		System.out.println("Login verified");
	}
	public void movetologin() throws InterruptedException {
		WebElement h=driver.findElement(By.xpath(hp.Header()));
		System.out.println("Headder identified");
		Actions act = new Actions(driver);
		act.moveToElement(h.findElement(By.xpath(hp.getloginlink()))).perform();
		act.moveToElement(h.findElement(By.xpath(hp.getSpiceclubMembers()))).perform();
		System.out.println("Mouse hover to clubmembers");
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeClickable(h.findElement(By.xpath(hp.getMemberLogin()))));
		h.findElement(By.xpath(hp.getMemberLogin())).click();
		System.out.println("Member login clicked");
	}
	
public void logout() {
		
		driver.findElement(By.xpath(lp.getlogout())).click();
		System.out.println("Logout clicked");
	}
}
