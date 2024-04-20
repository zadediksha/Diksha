package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_LocatorsExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("zadediksha3@gmail.com");
		
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("diksha@123");
		
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();

	}

}
