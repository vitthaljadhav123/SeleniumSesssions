package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_0_Em")).click();
		
		driver.findElement(By.xpath("//*[@id=\"u_b_b_6p\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id=\"u_b_d_Hj\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id=\"u_b_g_P4\"]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("Test@123");
		
		
		WebElement day= driver.findElement(By.id("day"));
		WebElement month= driver.findElement(By.id("month"));
		WebElement year= driver.findElement(By.id("year"));
		
//		Select select= new Select(day);
//		
//		select.selectByVisibleText("15");
//		select.deselectByIndex(5);
//		select.deselectByValue("9");
//		
//        Select select1= new Select(month);
//		
//		select.selectByVisibleText("Jun");
//		
//		
//        Select select2= new Select(year);
//		
//		select.selectByVisibleText("1990");
		
		
		selectDropDownByValue(day, "5");
		selectDropDownByValue(month, "feb");
		selectDropDownByValue(year, "1999");

	}
	
	public static void selectDropDownByValue(WebElement element, String value) {
		
		Select select = new Select(element);
		
		select.selectByVisibleText(value);
	}
	
public static void selectDropDownBytext(WebElement element, String text) {
		
		Select select = new Select(element);
		
		select.selectByVisibleText(text);
}

public static void selectDropDownByIndex(WebElement element, String Index) {
	
	Select select = new Select(element);
	
	select.selectByVisibleText(Index);
	
}}
