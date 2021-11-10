package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	public WebDriver driver;
	@FindBy(xpath="//input[@name='cgv']")
	private WebElement checkbox;

	
	public WebElement getCheckbox() {
		return checkbox;
	}
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement fout;

	public WebElement getFout() {
		return fout;
	}

	public Shipping (WebDriver driver7) {
		this.driver= driver7;
		PageFactory.initElements(driver7, this);
}
}