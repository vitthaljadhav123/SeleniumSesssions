package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcepts {

	
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
        WebDriver driver= new ChromeDriver();      //Launch browser
		
		driver.get("https://www.google.com");    //Launch URL
		
		driver.navigate().to("https://mail.rediff.com/");
		
		
		String title= driver.getTitle();
		System.out.println("Page title is: "+ title);
		
		driver.navigate().back(); 
		
		driver.navigate().refresh();
		
		
		
		
	}
}
