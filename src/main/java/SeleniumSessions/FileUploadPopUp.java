package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(5000);
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\vitthal.j\\eclipse-workspace\\SeleniumSessions\\target\\classes\\SeleniumSessions\\NavigationConcepts.class");
		
		// type = "file" is Mandatory Attribute requires
		
		
	}
}
