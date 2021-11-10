package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
	
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement cartout;

	public WebElement getCartout() {
		return cartout;
	}

	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement add;

	public WebElement getAdd() {
		return add;
	}

	public Order (WebDriver driver6) {
		this.driver= driver6;
		PageFactory.initElements(driver6, this);
	}

}
