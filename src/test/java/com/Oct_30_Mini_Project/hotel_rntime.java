package com.Oct_30_Mini_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base_Class.Base_Class;
import pom2.Book_Hotel;
import pom2.Confirm;
import pom2.Search_Hotel;
import pom2.Select_Hotel;
import pom2.login;

public class hotel_rntime extends Base_Class {
	public static WebDriver driver =Base_Class.getBrowser("chrome");
	public static login ur = new login(driver);
	public static Search_Hotel sh =new Search_Hotel(driver);
	public static Select_Hotel seh=new Select_Hotel(driver);
	public static Book_Hotel bh = new Book_Hotel(driver);
	public static Confirm ch = new Confirm(driver);

	public static void main(String[] args) throws IOException, InterruptedException {
		getURL("https://adactinhotelapp.com/");
		inputValueElement(ur.getUsername(), "SeleniumJavaTeste");
		inputValueElement(ur.getPassword(), "Sel@12345");
		clickOnElement(ur.getSigin());
		dropDown("byIndex", sh.getLocation(), "4");
		dropDown("byIndex", sh.getHotels(), "2");
		dropDown("byIndex", sh.getRoomtype(), "2");
		dropDown("byIndex", sh.getNoroom(), "4");
		inputValueElement(sh.getCheckin(), "21/10/2021");
		inputValueElement(sh.getCheckout(), "26/10/2021");
		dropDown("byIndex", sh.getAdperroom(), "2");
		dropDown("byIndex", sh.getChperroom(), "3");
		clickOnElement(sh.getSubmit());
		clickOnElement(seh.getSelect());
		clickOnElement(seh.getConfirm());
		inputValueElement(bh.getFname(), "SELENIUM");
		inputValueElement(bh.getLname(), "TESTER");
		inputValueElement(bh.getAdd(), "No 2 Swjahg Strert NewYork fgsahjajk");
		inputValueElement(bh.getCardnum(), "4988 4388 4388 4305");
		dropDown("byIndex", bh.getCardtype(), "2");
		dropDown("byIndex", bh.getExpmonth(), "3");
		dropDown("byIndex", bh.getExpyear(), "12");
		inputValueElement(bh.getCvv(), "737");
		clickOnElement(bh.getBooknow());
		sleep(1000);
		scrollUpandDown(ch.getItem());
	    clickOnElement(ch.getItem());

		clickOnElement(ch.getChecker());

		takeScreenShot("adactin");

	}
}
