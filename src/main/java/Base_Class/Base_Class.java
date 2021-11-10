package Base_Class;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {
		try {

			if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "//Driver//chromedriver.exe");
				driver = new ChromeDriver();
			}

			else if (type.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "//Driver//geckodriver.exe");
				driver = new FirefoxDriver();

			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;

	}

	public static void getURL(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void inputValueElement(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void dropDown(String type, WebElement element, String value) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("byIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}

	}

	public static void takeScreenShot(String imgname) throws IOException {
		TakesScreenshot tr = (TakesScreenshot) driver;
		File sour = tr.getScreenshotAs(OutputType.FILE);
		File desti = new File(
				"C:\\Users\\krbch\\eclipse-workspace\\Oct_30_Mini_Project\\Screenshot//" + imgname + ".png");
		FileUtils.copyFile(sour, desti);

	}

	public static void sleep(int milliseconds) throws InterruptedException {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollUpandDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void implicitWait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
	}

	public static void explicitWait(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	
	public static void actionsClass(String actionName, WebElement element) {
		try {
			Actions a = new Actions(driver);
			if(actionName.equalsIgnoreCase("moveto")){
				a.moveToElement(element).build().perform();
			}else if(actionName.equalsIgnoreCase("clickon")) {
				a.click(element).build().perform();
			}else if(actionName.equalsIgnoreCase("doubleClick")) {
				a.doubleClick(element).build().perform();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
