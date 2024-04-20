package com.MainApp;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		WebElement flight = driver.findElement(By.linkText("Flights"));
		
		Actions action = new  Actions(driver);
		
		// 1. click and hold method - it will perform
		// the mouse left key operation and hold given webelement
	
		action.clickAndHold(flight).perform();
		
		// 2. Release method - it will release the mouse of  given webelement
		
		//action.release().perform();
		
		// 3. context click - it will right click of mouse at given element
		//action.contextClick(flight).perform();
		
		// 4. double click - it will double click on 
		
		

	}

}
