package com.spicejet.Pages;

import com.spicejet.Utilities.Configreader;

public class LoginPage {

	Configreader cr;
	public LoginPage() {
		String proppath=".//src//main//resources//com//spicejet//Locators//Login.properties";
		cr=new Configreader(proppath);
	}
		
	public  String getusername() {
		return cr.getProperty("Username");
	}
	public  String getpassword() {
		return cr.getProperty("Password");
	}
	public  String getloginbutton() {
		return cr.getProperty("LoginButton");
	}
	public  String getForgotPassword() {
		return cr.getProperty("ForgotPassword");
	}
	public  String getSignuplink() {
		return cr.getProperty("Signuplink");
	}
	public  String getsignupbutton() {
		return cr.getProperty("signupbutton");
	}
	public  String getCountry() {
		return cr.getProperty("Country");
	}
	public  String getwelcome() {
		return cr.getProperty("Welcome");
	}
	public String getlogout() {
		return cr.getProperty("Logout");
	}
	}