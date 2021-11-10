package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_MyStore {
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[5]")
	private WebElement select;
	public WebElement getSelect() {
		return select;
	}
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[2]")
	private WebElement select1;
	public WebElement getSelect1() {
		return select1;
	}
	public Women_MyStore(WebDriver driver4) {
		this.driver= driver4;
		PageFactory.initElements(driver4, this);
	}








}


