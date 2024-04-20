package com.MainApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToOpenTheURL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 1. by using the driver. get method
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		// 2. by using driver.navigate.to  method
		driver.navigate().to("https://demo.guru99.com/test/facebook.html");
		
		// 3. by using string 
		
		String url = "https://demo.guru99.com/test/facebook.html";
		
		

	}

}
