package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Store {
	public WebDriver driver;


	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;

	public WebElement getWomen() {
		return women;
	}
	
	public My_Store(WebDriver driver3) {
		this.driver= driver3;
		PageFactory.initElements(driver3, this);
	}



}
