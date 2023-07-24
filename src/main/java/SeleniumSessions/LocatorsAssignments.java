package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsAssignments {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://app.hubspot.com/signup");
		
//		driver.findElement(By.xpath("//button[@id=\'hs-eu-confirmation-button\']")).click();
		driver.findElement(By.xpath("//div[@class='TextInputstyles__InputStyles-sc-5kcv37-0 frZMnU']")).sendKeys("test@yopmail.com");
		driver.findElement(By.cssSelector("i18n-string")).click();
		
		
		
		
	}
}
