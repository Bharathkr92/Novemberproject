package com.Oct_30_Mini_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.Home_Page;
import com.pom.Login_page;
import com.pom.My_Store;
import com.pom.Order;
import com.pom.Payment;
import com.pom.Printer_Summer;
import com.pom.Shipping;
import com.pom.Women_MyStore;
import com.pom.back;

import Base_Class.Base_Class;

public class Test_Runner extends Base_Class {
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Home_Page ap = new Home_Page(driver);
	public static Login_page lg = new Login_page(driver);
	public static My_Store st = new My_Store(driver);
	public static back bk = new back(driver);
	public static Women_MyStore se = new Women_MyStore(driver);
	public static Printer_Summer ps = new Printer_Summer(driver);
	public static Order od = new Order(driver);
	public static Shipping sp = new Shipping(driver);
	public static Payment pay = new Payment(driver);

	public static void main(String[] args) throws InterruptedException, IOException {
		getURL("http://automationpractice.com/index.php");
		clickOnElement(ap.getSigin());

		inputValueElement(lg.getEmail(), "nowasew810@specialistblog.com");

		inputValueElement(lg.getPwd(), "Sel@12345");

		clickOnElement(lg.getSigin());

		clickOnElement(bk.getBack());

		clickOnElement(st.getWomen());

		clickOnElement(se.getSelect());
		clickOnElement(se.getSelect1());
		clickOnElement(ps.getCart());
		sleep(2000);

		clickOnElement(ps.cout);
		sleep(1000);

		clickOnElement(od.getCartout());

		clickOnElement(od.getAdd());

		clickOnElement(sp.getCheckbox());

		clickOnElement(sp.getFout());

		clickOnElement(pay.getPay());
		takeScreenShot("cartfinal");

		clickOnElement(pay.getOutdel());

	}
}
