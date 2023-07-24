package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StailElementException {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://classic.freecrm.com");
		
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys("naveen");
		
		driver.navigate().refresh();
		
		username= driver.findElement(By.name("username"));
		username.sendKeys("SeleniumUser");
		
		
		
	}
}
