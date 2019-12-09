package com.spicejet.Pages;

import com.spicejet.Utilities.Configreader;

public class GenericPage {

	Configreader cr;
	public GenericPage() {
		String proppath="//src//main//resources//com//spicejet//Locators//General.properties";
		cr=new Configreader(proppath);
	}
	
	public  String geturl() {
		return cr.getProperty("url");
	}
    public String getbrowser() {
    	return cr.getProperty("browser");
    }
    public String getusername() {
    	return cr.getProperty("username");
    }
    public String getpassword() {
    	return cr.getProperty("password");
    }
}
