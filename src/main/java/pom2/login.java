package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	public WebDriver driver;
   @FindBy(xpath="//input[@name='username']") 
   private WebElement username;
   
   @FindBy(xpath="//input[@name='password']")
private WebElement password;
   @FindBy(xpath="//input[@name='login']")
   private WebElement sigin;

public WebElement getSigin() {
	return sigin;
}

public WebElement getUsername() {
		return username;
	}
		
public WebElement getPassword() {
	return password;
}

public login(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}	
}
