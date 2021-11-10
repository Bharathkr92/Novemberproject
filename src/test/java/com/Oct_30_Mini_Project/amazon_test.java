package com.Oct_30_Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base_Class.Base_Class;

public class amazon_test extends Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = getBrowser("chrome");

		getURL("https://www.amazon.in/");
		WebElement humberg = driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]"));
		clickOnElement(humberg);
		sleep(1000);
		scrollUpandDown(humberg);
		WebElement sigin = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[30]/a"));
		clickOnElement(sigin);


		
	}

	
	

}
