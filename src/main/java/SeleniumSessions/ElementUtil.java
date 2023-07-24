package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		
		this.driver=driver;
	}
	public WebElement getElement(By locator) {
		
		WebElement element=driver.findElement(locator);
		 return element;
		
	}
	
	public void soSendkeys(By locator, String value) {
	    getElement(locator).sendKeys(value);	
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	public String doGetText(Object homePageHeader) {
		// TODO Auto-generated method stub
		return null;
	}
		
	}
	
	

