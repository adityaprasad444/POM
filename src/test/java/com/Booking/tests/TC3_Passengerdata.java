package com.Booking.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.spicejet.PageHelper.BookingHelper;

@Listeners(com.spicejet.Utilities.ListnerHelp.class)
public class TC3_Passengerdata extends BookingHelper {

	@Test(priority = 3)
	public void providedata() throws InterruptedException {
		Next();
		Thread.sleep(10000);
		filldetails();
		fillA2();
	}
}
