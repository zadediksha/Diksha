package com.MainApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPracticals {

	public static void main(String[] args) {
		
		// this method help you to set the browser path which we used to need  to run automation script
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		
		
		// to create chromedriver object we need to webdriver interface referance variable and 
		//need to create object for browser
		
		WebDriver driver = new ChromeDriver();
		
		// 1.it is used for the open the URl method 
		driver.get("https://www.amazon.in/");
		
		// 2.this method used for the fetch current page title 
		String title= driver.getTitle();
		System.out.println(title);
		
		//3. this method used for the to get the currently open url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//4. this method used for the source of the url 
		String pagesrc =driver.getPageSource();
		System.out.println(pagesrc);
		
		
		// 5.it is used for the close  the current opened url window
		driver.close();
		
		// 6. it is used for the close  the all opened url 
		driver.quit();
		

	}

	
}
