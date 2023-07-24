package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
        WebDriver driver= new ChromeDriver();      //Launch browser
		
		driver.get("https://www.google.com");    //Launch URL
		
		String title= driver.getTitle();         //To get the page title 
		System.out.println("page title is:" +title);
		
		driver.quit();
		
		//driver.close();
		
		System.out.println(driver.getTitle());    //NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		
	}
}
