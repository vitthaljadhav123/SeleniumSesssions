package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdown_Handling {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		
		
// 		Case 1
//		selectChoiceValues(driver, "choice 2");
//		selectChoiceValues(driver, "choice 3");
//		selectChoiceValues(driver, "choice 6 2 3");
//		selectChoiceValues(driver, "choice 7");
		
//		Case 2 
//		selectChoiceValues(driver, "choice 2", "choice 3", "choice 6 2 3");
//		List<WebElement> choicelist=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		
//		Case 3 
		selectChoiceValues(driver, "ALL");
		
		
//		for(int i=0; i<choicelist.size(); i++) {
//			String text=choicelist.get(i).getText();
//			System.out.println(text);
//			
//			if(text.equals("choice 7")) {
//				choicelist.get(i).click();
//				break;
			}
		
	
	
	public static void selectChoiceValues(WebDriver driver, String...value) {
		
         List<WebElement> choicelist=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
         if(!value[0].equalsIgnoreCase("ALL")) {
 			
		for(int i=0; i<choicelist.size(); i++) {
			String text=choicelist.get(i).getText();
			System.out.println(text);
			
			for (int k=0; k<value.length; k++) {	
			if(text.equals(value[k])) {
				choicelist.get(i).click();
				break;
			}}
		
	}
}
	}
	}
