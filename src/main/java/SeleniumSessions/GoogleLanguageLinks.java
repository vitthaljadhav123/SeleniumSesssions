package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		List<WebElement> links =driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
		
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) {
			String linkstext= links.get(i).getText();
			System.out.println(linkstext);
			
			links.get(i).click();
			links =driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
			
			
		}}}