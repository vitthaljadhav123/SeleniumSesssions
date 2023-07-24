package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Totallinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//get total number of links on the page
		//print the text of each link 
		//link -->  <a href= "" signup/>
		
		List<WebElement> list= driver.findElements(By.tagName("a"));
		
		int totalLinks= list.size();
		System.out.println("total links on the page:"+ totalLinks);
		
		for (int i=0; i<totalLinks; i++) {
			
			String linkName= list.get(i).getText();
			
			if(! linkName.isEmpty()) {
				System.out.println(i+"-->"  + linkName  + "-->");
				System.out.println(list.get(i).getAttribute("href"));
				
			}
		
		}
		
		
		
		
		
		
	}
}
