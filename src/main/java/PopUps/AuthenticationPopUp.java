package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {

	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		// Case 1
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		//Case 2
//		String username= "admin";
//		String password= "admin";
//		
//		driver.get("https://"+username+ ":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		// Id = admin 
		// pass= admin for this site

	}
}
