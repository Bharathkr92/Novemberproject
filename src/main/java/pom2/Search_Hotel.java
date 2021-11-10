package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	

	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	@FindBy(name="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(name="room_nos")
	private WebElement noroom;
	@FindBy(id="datepick_in")
	private WebElement checkin;
	@FindBy(name="datepick_out")
	private WebElement checkout;
	@FindBy(id="adult_room")
	private WebElement adperroom;
	
	@FindBy(name="child_room")
	private WebElement chperroom;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement submit;
	
	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getAdperroom() {
		return adperroom;
	}

	public WebElement getChperroom() {
		return chperroom;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getNoroom() {
		return noroom;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getLocation() {
		return location;
	}

	public Search_Hotel(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver3, this);
		
	}	
	
	
	
	
}
