package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcepts {

	
	public static void main(String[] args) throws InterruptedException {
		
		
WebDriverManager.chromedriver().setup();
		
        WebDriver driver= new ChromeDriver(); 
        
//        driver.get("https://app.hubspot.com/login");
        driver.get("https://www.freshworks.com/");
        
        Thread.sleep(5000);
        
        driver.manage().window().maximize();
        
//        1. id
        
        
//        Case 1
        
//        driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("test@123");
//        driver.findElement(By.id("loginBtn")).click();
        
        
//         Case 2 ---Alway prefer these method 
        
//        WebElement email=driver.findElement(By.id("username"));
//        WebElement password= driver.findElement(By.id("password"));
//        WebElement login= driver.findElement(By.id("loginBtn"));
//        
//        email.sendKeys("test@gmail.com");
//        password.sendKeys("test@123");
//        login.click();

        
//        2. Name
//        
//        driver.findElement(By.name("username")).sendKeys("test@gmail.com");
        
        
        
//        3.classname
//         form-control pricate-form__control login-email
//        driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//        driver.findElement(By.className("login-password")).sendKeys("test@123");

        
//        4. xpath
//        -xpath is a locator, but not an attribute
//        this is the address of the element in the DOM(Document object model)
        
//          driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@gmail.com");
//          Thread.sleep(5000);
//          driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");
//          Thread.sleep(5000);
//          driver.findElement(By.xpath("//button[@id='loginBtn']")).click();

          
//        5. cssSelector:  #username
//         cssSelector is a locator , but not an attribute
          
//          driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//          Thread.sleep(5000);
//          driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
//          Thread.sleep(5000);
//          driver.findElement(By.cssSelector("#loginBtn")).click();
          
          
          
//          6. linkText
//          -Only for links 
//          - Links are always starts with "a"

//          driver.findElement(By.linkText("Sign up")).click();
          
          
        
//        7.partialLinkText  
//        -Only for link
        
//        driver.findElement(By.partialLinkText("Sign")).click();
          
          
//        8. TagName 
        
          String tag= driver.findElement(By.tagName("h1")).getText();
        
          System.out.println(tag);
        
        
          
        
	}
}
