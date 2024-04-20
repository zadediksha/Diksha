package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WaysToRefreshThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		
		//1. by using refresh method
		//driver.navigate().refresh();
		
		// 2. get current url
		//driver.get(driver.getCurrentUrl());
		
		// 3. by using current url and that navigate method
		//driver.navigate().to(driver.getCurrentUrl());
		
		// 4. by using f5 key
		Actions actions = new Actions(driver);
		//driver.findElement(By.id("email"));
		actions.sendKeys(Keys.F5).perform();
		
		// by using the ASCII value 
		//driver.findElement(By.id("email")).sendKeys("\uE035");
		

	}

}
