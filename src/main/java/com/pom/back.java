package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class back {
	
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/a")
	private WebElement back;
	
	public WebElement getBack() {
		return back;
	}

	public back(WebDriver drive3) {
		this.driver= drive3;
		PageFactory.initElements(drive3, this);
	}

	
	

}
