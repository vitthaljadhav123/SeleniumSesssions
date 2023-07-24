package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) {

		String browser = "chrome";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver=new SafariDriver();
		} else if(browser.equalsIgnoreCase("ie")) {
			driver= new InternetExplorerDriver();
			
		}else {
			System.out.println("browser is not found --"+ browser);
		}
		
		
		driver.get("http://www.google.com");
		
		String title= driver.getTitle();
		System.out.println("Page title is : "+ title);
		
	}

}
