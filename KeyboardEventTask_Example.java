package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventTask_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement currentadd = driver.findElement(By.id("currentAddress"));
		WebElement permentadd = driver.findElement(By.id("permanentAddress"));
		
		Actions action = new Actions(driver);
		//enter the value in current address 
		currentadd.sendKeys("pune");
		
		// we will select the all value from the current address
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		
		// keyup method used to relese the given key
		action.keyUp(Keys.CONTROL);
     	action.build().perform();
		
//		// now we will copy the entire address
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
//		// we will switch to next element we will use tab key
		action.sendKeys(Keys.TAB);
		action.build().perform();
       
//		//now we will paste the entire address
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
	}

}
