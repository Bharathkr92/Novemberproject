package com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Readers {
	public static Properties p;
	public Configuration_Readers() throws Throwable {
		File f= new File("C:\\Users\\krbch\\eclipse-workspace\\Oct_30_Mini_Project\\src\\main\\java\\com\\Properties\\Configuration2.properties");
       FileInputStream fis = new FileInputStream(f);	
      p = new Properties();   
      p.load(fis);

	}

	public String getURL() {
		String url = p.getProperty("url");
		return url;
		
	}
	
	public String getUsername1() {
		String username1 = p.getProperty("username1");
		return username1;
	}
	public String getPassword1() {
		String password1 = p.getProperty("password1");
		return password1;
	}
	
	public String getCheckin() {
		String checkin = p.getProperty("checkin");
		return checkin;
	}
	public String getCheckout() {
		String checkout = p.getProperty("checkout");
		return checkout;
	}
	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public String getLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	public String getCardnumber() {
		String cardnumber = p.getProperty("cardnumber");
		return cardnumber;
}
	public String getCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
