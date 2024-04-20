package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkText_LocatorsExample {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement forget = driver.findElement(By.linkText("Forgot your password?"));
		forget.click();
		
		WebElement forget1 = driver.findElement(By.partialLinkText("password"));
		forget1.click();
		
		

	}

}
