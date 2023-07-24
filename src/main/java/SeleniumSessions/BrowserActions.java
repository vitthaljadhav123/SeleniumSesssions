package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {
 
	/**
	 * This method is used to launch the browswer/iNITIALIZE THE DRIVER ON THE BASIS OF GIVEN BROWSER
	 * @param browser
	 */
	WebDriver driver;
	public WebDriver launchBrowser(String browser) {
	
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "Safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver=new SafariDriver();
			break;

		default:
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
	
	public void launchURL(String URL) {
		
		
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	public String doGetTitle() {
		return driver.getTitle();
	}
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
}
