package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands_Example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 1. to open the URL we can use navigate.to method
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		// 2 . to refresh the page
		driver.navigate().refresh();
		
		// 3. to redirect on one step back
		WebElement flight = driver.findElement(By.linkText("Flights"));
		flight.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		// 4.   to redirect on one step forward 
		Thread.sleep(2000);
		driver.navigate().forward();	
		
	
	}

}
