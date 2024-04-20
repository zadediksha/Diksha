package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DubleClickAndDragAndDrop_Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		//4. double click - it will double click on given element
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));
		//action.doubleClick(button).perform();
		//driver.switchTo().alert().accept(); // using alert 
		
		// 5. Drag and Drop 
		
		WebElement draganddrop  = driver.findElement(By.linkText("Drag and Drop"));
		draganddrop.click();
		
		WebElement drag = driver.findElement(By.id("dragdiv"));
		WebElement drop = driver.findElement(By.id("dropdiv"));
		action.dragAndDrop(drag, drop).perform();
		//action.dragAndDropBy(drag, 200, 200).perform(); // using xand y axis 
		

	}

}
