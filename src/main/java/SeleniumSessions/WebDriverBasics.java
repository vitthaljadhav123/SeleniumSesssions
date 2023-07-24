package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vitthal.j\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();    //Launch browser
		
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");    //LAunch URL
		
		String title= driver.getTitle();         //To get the page title 
		System.out.println("page title is:" +title);
		
		//Validation point: actual vs expected result 
		
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Title is not correct");
		}
		
		System.out.println(driver.getCurrentUrl());
		String url= driver.getCurrentUrl();
		
		if(url.contains("https://www.google.com/")) {
			System.out.println("Correct url");
			
		}
		else {
			System.out.println("Incorrect url");
			
		}
		
		System.out.println(driver.getPageSource());
		
		
		driver.quit();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
