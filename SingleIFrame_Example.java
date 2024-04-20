package com.MainApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleIFrame_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
	List<WebElement> noofframe = driver.findElements(By.tagName("iframe"));
	int  size= noofframe.size();
	
	System.out.println("no of frame:"+size);
	
	// 1.switch by index
	//driver.switchTo().frame(1);
	
	// 2.switch by id
	//driver.switchTo().frame("singleframe");
	
	// switch by name
	driver.switchTo().frame("SingleFrame");
	
	WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
	text.sendKeys("Diksha");
		
	}

}
