package com.spicejet.Pages;

import com.spicejet.Utilities.Configreader;

public class Homepage{

	Configreader cr;
	public Homepage() {
		String proppath="./src/main/resources/com/spicejet/Locators/Homepage.properties";
		cr=new Configreader(proppath);
	}
	public  String getloginlink() {
		return cr.getProperty("Loginlink");
	}
	public  String getSpiceclubMembers() {
		return cr.getProperty("SpiceclubMembers");
	}
	public  String getMemberLogin() {
		return cr.getProperty("MemberLogin");
	}
	public String getSignup() {
		return cr.getProperty("Signup");
	}
	public String Header() {
		return cr.getProperty("Header");
	}
}
