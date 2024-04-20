package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		Actions action = new Actions(driver);
		// 1. keys down method - it will press the key and does not release
		action.keyDown(username, Keys.SHIFT).sendKeys("Diksha").perform();
		action.keyDown(password, Keys.SHIFT).sendKeys("Diksha@123").perform();
		
		action.keyDown(Keys.ENTER).perform();

	}

}
