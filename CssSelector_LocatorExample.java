package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_LocatorExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
        
		 WebDriver driver = new ChromeDriver();
				
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1. by using tag and class name (we have to used dot for combine)
		//WebElement user = driver.findElement(By.cssSelector("input.inputtext"));
		//user.sendKeys("zadediksha@gmail.com");
		
		
		// 2.by using tag and id   (we need to used to hash(#)for combine)
		//WebElement pass = driver.findElement(By.cssSelector("input#pass"));
		//pass.sendKeys("diksha@123");
       
		
		// 3. by using tag and attributes (we need to add square brackets)
		//WebElement login = driver.findElement(By.cssSelector("input[type='submit']"));
		//login.click();
		
		
		// 4. by using tag, class and attribute  (we have to used dot for combine and add square brackets )
//		WebElement user = driver.findElement(By.cssSelector("input.inputtext[id='email'][name='email']"));
//		user.sendKeys("zadediksha@gmail.com");
//		
//		
//		//5. tag , id and attribute (need to used hash and square bracket)
//		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit']"));
//		login.click();
//	
	    
		// 6. by using start with (it will find the locator based on starting character using attribute)
		
		WebElement user = driver.findElement(By.cssSelector("input[name^='emai']"));
		user.sendKeys("zadediksha@gmail.com");
		
		
		// 7 by using end with (it will find the locator based on ending character using attribute)
		WebElement pass = driver.findElement(By.cssSelector("input[type$='word']"));
		pass.sendKeys("diksha@123");
		
		
		// 8. by using contain with(it will find the locator based on the character which is present or not)
		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type*='bmi']"));
    	login.click();
	
	    
	
	}

}
