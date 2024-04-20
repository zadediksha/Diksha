package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_LocatorsExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		// to find the element by using id locator firstly we need to create ref 
		//variable of the webelemnt interface need to used below syntax
		
		WebElement username =  driver.findElement(By.id("email"));
		username.sendKeys("zadediksha3@gmail.com");  // sendkeys it is used to enter the value in text box
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("diksha123");
		
		WebElement login = driver.findElement(By.id("u_0_b"));
		login.click(); // it is used to any button, radio button checkbox or link 
		//login.submit(); // only used for submit button
	}

}
