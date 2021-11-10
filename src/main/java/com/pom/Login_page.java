package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSigin() {
		return sigin;
	}

	@FindBy(xpath="//input[@name='passwd']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@name='SubmitLogin']")
	private WebElement sigin;
	


	public Login_page(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}


}
