package com.POBJ_MAG;

import org.openqa.selenium.WebDriver;

import com.pom.Home_Page;
import com.pom.Login_page;
import com.pom.My_Store;
import com.pom.Order;
import com.pom.Payment;
import com.pom.Printer_Summer;
import com.pom.Shipping;
import com.pom.Women_MyStore;
import com.pom.back;

public class Page_Object_Manager1 {
	
	public WebDriver driver;
	private Home_Page hp;
	
	public Page_Object_Manager1(WebDriver driver2) {
		this.driver=driver2;
	}

	public Home_Page getInstanceHp() {
		if(hp == null) {
			hp = new Home_Page(driver);
			
		}
		return hp;
		
	}
	private Login_page lg;
	
	public Login_page getInstancelg() {
		if(lg == null) {
			lg= new Login_page(driver);
			
		}
		return lg;
		
	}
	private My_Store  st;
	
	public My_Store getst() {
		if(st == null) {
			st = new My_Store(driver);
		}
		return st;
	}
	private back bk;
	public back getbk() {
		if(bk == null) {
			bk = new back(driver);
		}
		return bk;
	}
	
	private Women_MyStore se;
	public Women_MyStore getse() {
		if( se == null) {
			se = new Women_MyStore(driver);
		}
		return se;
	}
	private Printer_Summer ps;
	public Printer_Summer getps() {
		if(ps == null) {
			ps = new Printer_Summer(driver);
		}
		return ps;
	}
	
	private Order od;
    public Order getod() {
    	if(od == null) {
    		od = new Order(driver);
    	}
    	return od;
    	
    }
	private Shipping sp;
	 public Shipping getsp() {
	    	if(sp == null) {
	    		sp = new Shipping(driver);
	    	}
	    	return sp;
	 }
	private Payment pay;
	 public Payment getpay() {
	    	if(pay == null) {
	    		pay = new Payment(driver);
	    	}
	    	return pay;
	 }
	
	
	

}
