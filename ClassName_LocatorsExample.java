package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName_LocatorsExample {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.className("inputtext"));
		username.sendKeys("zadediksha3@gmail");
		
		WebElement password = driver.findElement(By.className("inputtext"));
		password.sendKeys("diksha123");
		
				
		

	}

}
