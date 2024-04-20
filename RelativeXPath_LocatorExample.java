package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath_LocatorExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1. using the simple Xpath method by using tag and attribute
//		
//		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
//		username.sendKeys("zadediksha@gmail.com");
//		
//		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
//		password.sendKeys("diksha");
//		
//		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
//		login.click();
		
		// 2. using and condition
//		WebElement username = driver.findElement(By.xpath("//input[@name='email' and @type='text']"));
//	    username.sendKeys("zadediksha@gmail.com");
//	
//		WebElement password = driver.findElement(By.xpath("//input[@id='pass' and @type='password']"));
//	    password.sendKeys("diksha");
//	
//	    WebElement login = driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']"));		
//	    login.click();
	    
	    
//	    // 3. using or condition
//	    WebElement username = driver.findElement(By.xpath("//input[@name='email' or @type='text']"));
//	    username.sendKeys("zadediksha@gmail.com");
//	
//	    WebElement password = driver.findElement(By.xpath("//input[@id='pass' or @type='password' or @tabindex='100']"));
//	    password.sendKeys("diksha");
//	
//	    WebElement login = driver.findElement(By.xpath("//input[@type='submit' or @value='Log In']"));		
//	    login.click();
//	    
	    
	    
	    // 4. using contains (we need to add key and value)
//	    WebElement username = driver.findElement(By.xpath("//input[contains(@type,'tex')]"));
//	    username.sendKeys("zadediksha@gmail.com");
//	
//		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'pas')]"));
//	    password.sendKeys("diksha");
//	
//	    WebElement login = driver.findElement(By.xpath("//input[contains(@value,'Log')]"));		
//	    login.click();
		
		
		// 5. Using Starts With (we need to add start character )
//	    WebElement username = driver.findElement(By.xpath("//input[starts-with(@name,'em')]"));
//	    username.sendKeys("zadediksha@gmail.com");
//	
//		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pa')]"));
//	    password.sendKeys("diksha");
//	
//	    WebElement login = driver.findElement(By.xpath("//input[starts-with(@type,'su')]"));		
//	    login.click();
//		
		
		// 6. Using the text method
//		WebElement link = driver.findElement(By.xpath("//*[text()='Agile Project']"));
//		link.click();
		
		WebElement link = driver.findElement(By.xpath("//*[text()='Security Project']"));
		link.click();
		
		 	

	}

}
