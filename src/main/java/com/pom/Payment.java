package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement pay;

	public WebElement getPay() {
		return pay;
	}

	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
	private WebElement outdel;

	public WebElement getOutdel() {
		return outdel;
	}

	public Payment(WebDriver driver8) {
		this.driver= driver8;
		PageFactory.initElements(driver8, this);

}


}