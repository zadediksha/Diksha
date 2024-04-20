package com.MainApp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_ScrollUpAndScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://moneyboats.com/");
		driver.manage().window().maximize();
		
		// 1. firstly we need to create reference variable of java script executer
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// Scroll down
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		
		// Scroll up
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");

	}

}
