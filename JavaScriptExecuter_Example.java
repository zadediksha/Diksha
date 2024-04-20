package com.MainApp;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		// 1. firstly we need to create reference variable of java script executer
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 2. in java script executer interface we have two method 
		// 1.executescript method 2. executeAsyscript
		
		driver.findElement(By.name("uid")).sendKeys("diksha");
		driver.findElement(By.name("password")).sendKeys("Diksha@123");
		
		WebElement login = driver.findElement(By.name("btnLogin"));
		
		// we will used below script to click on login button
	//	js.executeScript("arguments[0].click();", login);
		
		// we will used below script to handle alert
	//	js.executeScript("alert('User or Password is not valid');");
		
		// we will used below script to get all details of webpage like title, domain name
		
		
		String Domainname=js.executeScript("return  document.domain;").toString();
		System.out.println(Domainname);
		
		String title =js.executeScript("return document.title;").toString();
		System.out.println(title);
	
	    
	    String url=js.executeScript("return document.URL;").toString();
	    System.out.println(url);
//		
		// we will use below script to launch the new URL
		//js.executeScript("window.location='https://only-testing-blog.blogspot.com/'");

	}

}
