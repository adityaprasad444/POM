package com.User.Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.spicejet.PageHelper.UserHelper;

@Listeners(com.spicejet.Utilities.ListnerHelp.class)
public class Tc1_Login extends UserHelper{


	@BeforeTest
	@Parameters("browsername")
	public void initialize() {

		BrowserInit();
	}

	@Test(invocationCount = 10)
	public void verifylogin() throws InterruptedException {

		movetologin();
		login();
		Thread.sleep(2000);
		Verifylogin();
		logout();
	}


	@AfterTest
	public void Close() {
		
		destroy(); 
	}


}