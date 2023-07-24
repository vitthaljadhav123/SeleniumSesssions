package DragAndDrop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcepts {

	
public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightclick =driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(rightclick).build().perform();
		List<WebElement> options = driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]/span"));
		
		System.out.println("Total rightclick options :" + options.size());
		
		for (int i=0; i<options.size(); i++) {
			String text = options.get(i).getText();
			
			System.out.println(i + "-->" + text);
			
			if(text.equals("copy")) {
				options.get(i).click();
				break;
			}
		}
		
		
}}
