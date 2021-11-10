package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printer_Summer {
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button")
	private WebElement cart;
	
	
	public WebElement getCart() {
		return cart;
	}

@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
public WebElement cout;

	public WebElement getCout() {
	return cout;
}

	public Printer_Summer(WebDriver driver5) {
		this.driver= driver5;
		PageFactory.initElements(driver5, this);
	}

}
