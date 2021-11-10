package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public WebDriver driver;
	@FindBy(name="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(name="address")
	private WebElement add;
	@FindBy(id="cc_num")
	private WebElement cardnum;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expmonth;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expyear;
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow;
	public Book_Hotel(WebDriver driver5) {
		this.driver=driver5;
		PageFactory.initElements(driver5, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCardnum() {
		return cardnum;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	

}
