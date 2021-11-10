package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	@FindBy(xpath="//input[@name='radiobutton_0']")
	public WebElement select;
	public Select_Hotel(WebDriver driver4) {
	this.driver=driver4;
	PageFactory.initElements(driver4, this);
	}
	public WebElement getSelect() {
		return select;
	}
	@FindBy(xpath="//input[@name='continue']")
	public WebElement confirm;
	public WebElement getConfirm() {
		return confirm;
	}
	
	

}
