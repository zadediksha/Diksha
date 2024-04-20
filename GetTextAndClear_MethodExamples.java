package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndClear_MethodExamples {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
        
		 WebDriver driver = new ChromeDriver();
				
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		// clear method
		// to clear the populated text in the textbox we need to used clear method
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("zadediksha@gmail.com");
		username.clear();
		
		
		// gettext method 
		// it is used for the fetch the perticular element value
		
		WebElement text = driver.findElement(By.tagName("h1"));
		String s = text.getText();
		System.out.println(s);

	}

}
