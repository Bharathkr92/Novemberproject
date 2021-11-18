package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm {

public WebDriver Driver;

@FindBy(xpath="//*[@id=\"my_itinerary\"]")
private WebElement item;
@FindBy(xpath="//*[@id=\"check_all\"]")
private WebElement checker;

public WebElement getItem() {
	return item;
}

public WebElement getChecker() {
	return checker;
}


public Confirm(WebDriver driver6) {
	this.Driver=driver6;
	PageFactory.initElements(driver6, this);
	
}


}
