package com.POBJ_MAG;

import org.openqa.selenium.WebDriver;

import pom2.Book_Hotel;
import pom2.Confirm;
import pom2.Search_Hotel;
import pom2.Select_Hotel;
import pom2.login;

public class Page_Object_Manager2 {
	public WebDriver driver;
   

    private login ur;
    public Page_Object_Manager2(WebDriver driver2) {
    	this.driver=driver2;
	}
	public login getur() {
		if(ur == null) {
			ur = new login(driver);
			
		}
		return ur;
    }
private  Search_Hotel sh;
public Search_Hotel getsh() {
	if(sh == null) {
		sh = new Search_Hotel(driver);
		
	}
	return sh;
}
private Select_Hotel seh;
public Select_Hotel getseh() {
	if(seh== null) {
		seh= new Select_Hotel(driver);
		
	}
	return seh;
}	


private Book_Hotel bh; 
public Book_Hotel getbh() {
	if(bh== null) {
		bh= new Book_Hotel(driver);
		
	}
	return bh;
}	

private Confirm ch; 
public Confirm getch() {
	if(ch== null) {
		ch= new Confirm(driver);
		
	}
	return ch;
}

	
	
}
