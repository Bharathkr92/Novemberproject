package com.Oct_30_Mini_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Helper.File_Reader_Manager;
import com.Helper.File_Reader_Manager2;
import com.POBJ_MAG.Page_Object_Manager1;
import com.POBJ_MAG.Page_Object_Manager2;

import Base_Class.Base_Class;


public class hotel_rntime extends Base_Class {
	public static WebDriver driver =Base_Class.getBrowser("chrome");
	public static Page_Object_Manager2 pom2 = new Page_Object_Manager2(driver);

	public static void main(String[] args) throws Throwable {
		String url = File_Reader_Manager2.getInstanceFRM2().getInstanceCR2().getURL();
		 getURL(url);
//		String username1 = File_Reader_Manager2.getInstanceFRM2().getInstanceCR2().getUsername1();
		String dataFromExcel = DataFromExcel("C:\\Users\\krbch\\eclipse-workspace\\Oct_30_Mini_Project\\EXCEL\\Adactin.xlsx",0,0);
		inputValueElement(pom2.getur().getUsername(),dataFromExcel );
		String password1 = File_Reader_Manager2.getInstanceFRM2().getInstanceCR2().getPassword1();
		inputValueElement(pom2.getur().getPassword(), password1);
		clickOnElement(pom2.getur().getSigin());
		dropDown("byIndex", pom2.getsh().getLocation(), "4");
		dropDown("byIndex", pom2.getsh().getHotels(), "2");
		dropDown("byIndex", pom2.getsh().getRoomtype(), "2");
		dropDown("byIndex", pom2.getsh().getNoroom(), "4");
		String checkin = File_Reader_Manager2.getInstanceFRM2().getInstanceCR2().getCheckin();
		inputValueElement(pom2.getsh().getCheckin(), checkin);
		String checkout = File_Reader_Manager2.getInstanceFRM2().getInstanceCR2().getCheckout();
		inputValueElement(pom2.getsh().getCheckout(), checkout);
		dropDown("byIndex", pom2.getsh().getAdperroom(), "2");
		dropDown("byIndex", pom2.getsh().getChperroom(), "3");
		clickOnElement(pom2.getsh().getSubmit());
		clickOnElement(pom2.getseh().getSelect());
		clickOnElement(pom2.getseh().getConfirm());
		String firstname = File_Reader_Manager2.getInstanceFRM2().getInstanceCR2().getFirstname();
		inputValueElement(pom2.getbh().getFname(), firstname);
		String lastname = File_Reader_Manager2.getInstanceFRM2().getInstanceCR2().getLastname();
		inputValueElement(pom2.getbh().getLname(), lastname);
		String address = File_Reader_Manager2.getInstanceFRM2().getInstanceCR2().getAddress();
		inputValueElement(pom2.getbh().getAdd(), address);
		String cardnumber = File_Reader_Manager2.getInstanceFRM2().getInstanceCR2().getCardnumber();
		inputValueElement(pom2.getbh().getCardnum(), cardnumber);
		dropDown("byIndex", pom2.getbh().getCardtype(), "2");
		dropDown("byIndex", pom2.getbh().getExpmonth(), "3");
		dropDown("byIndex", pom2.getbh().getExpyear(), "12");
		String cvv = File_Reader_Manager2.getInstanceFRM2().getInstanceCR2().getCvv();
		inputValueElement(pom2.getbh().getCvv(), cvv);
		clickOnElement(pom2.getbh().getBooknow());
		sleep(1000);
		
	    clickOnElement(pom2.getch().getItem());

		clickOnElement(pom2.getch().getChecker());

		takeScreenShot("adactin");

}
}
