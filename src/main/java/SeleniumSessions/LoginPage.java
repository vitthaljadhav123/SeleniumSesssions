package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//By locators -- Page objects:
	
static	By emailId = By.id("username");
static	By password = By.id("password");
static	By loginButton = By.id("loginBtn");
static	By signUpLink = By.id("Sign up");
	
	
	public static void main(String[] args) throws InterruptedException   {
		
		BrowserActions br= new BrowserActions();
		
		WebDriver driver = br.launchBrowser("chrome");
		
		br.launchURL("https://app.hubspot.com/login?");
		
		ElementUtil elementUtil = new ElementUtil(driver);
		
//		elementutil.getElement(emailId).sendKeys("test@yopmail.com");
//		Thread.sleep(5000);
//		elementutil.getElement(password).sendKeys("test@123");
//		Thread.sleep(5000);
//
//		elementutil.getElement(loginButton).click();
			
		
		elementUtil.soSendkeys(emailId, "test@gmail.com");
		elementUtil.soSendkeys(password, "Test@123");
		elementUtil.doClick(loginButton);
		
		Object homePageHeader = null;
		String header =elementUtil.doGetText(homePageHeader);
		System.out.println("home page header is : "+ header);
		
		if(header.contains("Sale Dashboard")){
		System.out.println("Useer has logged in successfully");
	}
	else { 
		System.out.println("could not login");
		
	}
	
	
	
	
	
	}
	
}
