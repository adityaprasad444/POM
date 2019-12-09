package com.spicejet.Pages;

import com.spicejet.Utilities.Configreader;

public class BookingPage {

	Configreader cr;
	public BookingPage() {
		String proppath="//src//main//resources//com//spicejet//Locators//Booking.properties";
		cr=new Configreader(proppath);
	}
	
	public  String getHeader() {
		return cr.getProperty("Header");
	}
    public String getBook() {
    	return cr.getProperty("Book");
    }
    public String getOneWay() {
    	return cr.getProperty("Oneway");
    }
    public String getRoundtrip() {
    	return cr.getProperty("Roundtrip");
    }
    public String getFrom() {
    	return cr.getProperty("From");
    }
    public String getTo() {
    	return cr.getProperty("To");
    }
    public String getDp1() {
    	return cr.getProperty("Datepicker1");
    }
    public String getDp2() {
    	return cr.getProperty("Datepicker2");
    }
    public String getPassengers() {
    	return cr.getProperty("Passengers");
    }
    public String getadults() {
    	return cr.getProperty("Adults");
    }
    public String getchild() {
    	return cr.getProperty("Child");
    }
    public String getInfant() {
    	return cr.getProperty("Infant");
    }
    public String getCurrency() {
    	return cr.getProperty("Currency");
    }
    public String getSearch() {
    	return cr.getProperty("Search");
    }
    public String getdec4() {
    	return cr.getProperty("Dec4");
    }
    public String getdec7() {
    	return cr.getProperty("Dec7");
    }
    public String Continue() {
    	return cr.getProperty("Continue");
    }
    public String scChkbox() {
    	return cr.getProperty("SCchkbox");
    }
    public String Continuehead() {
    	return cr.getProperty("Continuehead");
    }
}
