package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
//		WebElement button = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//		button.click();
//		
//		// 1. to get the text form alert box we will use the get text method 
//		
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//		
//		// 2. to accept the alert we use accept method
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		
		
//	WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//	button.click();
//	
//	WebElement button1 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
//	button1.click();
//	
//	
//	// 3. to dismiss the alert we can used the dismiss method 
//	Thread.sleep(2000);
//	driver.switchTo().alert().dismiss(); // for the click on the cancel button
//	
	//driver.switchTo().alert().accept(); //(for click on ok button)
	
	
	// 4. to enter the text value in alert we can use sendkeys method
	
	WebElement button3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
	button3.click();
	
	WebElement button4 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
	button4.click();
	
	driver.switchTo().alert().sendKeys("Diksha Zade");
	driver.switchTo().alert().accept();
		
		

		

	}

}
