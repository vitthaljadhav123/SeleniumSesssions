package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling_2 {
	
	public static void main(String[] args) {
		
		
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		driver.switchTo().frame(1);
		WebElement day= driver.findElement(By.id("day"));
		WebElement month= driver.findElement(By.id("month"));
		WebElement year= driver.findElement(By.id("year"));
		
		day.click();
		selectDropDownByValue(day, "5");
		selectDropDownByValue(month, "feb");
		selectDropDownByValue(year, "1999");
//		
//		public static void selectDropDownValue(WebElement element, String value) {
//		Select select= new Select(element);
//		
//		List<WebElement> valueList= select.getOptions();
//		
//		System.out.println(valueList);
//		
//		for(int i=0; i<valueList.size(); i++) {
//			if(valueList.get(i).getText().equals("Jun")){
//				valueList.get(i).click();
//				break;
			}

	private static void selectDropDownByValue(WebElement day, String string) {
		// TODO Auto-generated method stub
		
	}
		
	}
	
	
	

