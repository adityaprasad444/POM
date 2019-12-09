package com.Booking.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.spicejet.PageHelper.BookingHelper;

@Listeners(com.spicejet.Utilities.ListnerHelp.class)
public class TC2_Booking extends BookingHelper {

	@Test(priority = 1)
	public void booking() throws InterruptedException {
		BookTkt();
	}
	
	@Test(enabled = false)
	public void gotonext() {
		Next();
	}
	
}
