package com.spicejet.Pages;

import com.spicejet.Utilities.Configreader;

public class PassengersPage {

	Configreader cr;
	public PassengersPage() {
		String proppath="//src//main//resources//com//spicejet//Locators//Passengers.properties";
		cr=new Configreader(proppath);
	}
	
	public String imflying() {
		return cr.getProperty("imflying");
	}
	public String Idtype() {
		return cr.getProperty("Idtype");
	}
	public String Idnumber() {
		return cr.getProperty("Idnumber");
	}
	public String A2Title() {
		return cr.getProperty("A2Title");
	}
	public String A2Fname() {
		return cr.getProperty("A2Fname");
	}
	public String A2Lname() {
		return cr.getProperty("A2Lname");
	}
	public String imcontact() {
		return cr.getProperty("imcontact");
	}
}
