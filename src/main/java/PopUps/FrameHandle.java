package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		// 
		// Case 1 : Name 
		driver.switchTo().frame("main");
		
		// Case 2 : Index
		driver.switchTo().frame(2);
		
		// Case 3 : WebElement 
		WebElement header= driver.findElement(By.xpath ("/html/body/h2"));
		System.out.println(header.getText());
		
		
		// How to Switch back to page 
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
	}
}
