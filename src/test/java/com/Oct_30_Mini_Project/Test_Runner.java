package com.Oct_30_Mini_Project;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Helper.File_Reader_Manager;
import com.POBJ_MAG.Page_Object_Manager1;


import Base_Class.Base_Class;

public class Test_Runner extends Base_Class {
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Page_Object_Manager1 pom = new Page_Object_Manager1(driver);
	static Logger log = Logger.getLogger(Test_Runner.class);
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);
		log.info("load_url");
		clickOnElement(pom.getInstanceHp().getSigin());
		
//		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		String dataFromExcel = DataFromExcel("C:\\Users\\krbch\\eclipse-workspace\\Oct_30_Mini_Project\\EXCEL\\Adactin.xlsx",6,0);
		inputValueElement(pom.getInstancelg().getEmail(), dataFromExcel);
		log.info("Pass_EmailID");
//		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		String dataFromExcel2 = DataFromExcel("C:\\Users\\krbch\\eclipse-workspace\\Oct_30_Mini_Project\\EXCEL\\Adactin.xlsx",7,0);
		inputValueElement(pom.getInstancelg().getPwd(), dataFromExcel2 );
         log.info("Pass_password");
		clickOnElement(pom.getInstancelg().getSigin());

		clickOnElement(pom.getbk().getBack());
		log.info("Go_BACK HOME PAGE");
        
		clickOnElement(pom.getst().getWomen());

		clickOnElement(pom.getse().getSelect());
		clickOnElement(pom.getse().getSelect1());
		clickOnElement(pom.getps().getCart());
		sleep(2000);
          log.info("Add_to_Cart");
		clickOnElement(pom.getps().getCout());
		sleep(1000);

		clickOnElement(pom.getod().getCartout());

		clickOnElement(pom.getod().getAdd());

		clickOnElement(pom.getsp().getCheckbox());

		clickOnElement(pom.getsp().getFout());

		clickOnElement(pom.getpay().getPay());
		takeScreenShot("cartfinal");

		clickOnElement(pom.getpay().getOutdel());

	}
}
