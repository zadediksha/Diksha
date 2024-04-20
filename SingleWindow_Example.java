package com.MainApp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindow_Example {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		
		//getwindowhanlde method will store the unique session id of opened window
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		
		//it will store the all the opened window after clicking on button
        Set<String> childwindow = driver.getWindowHandles();
        Iterator<String> i= childwindow.iterator();
        
        
        while(i.hasNext())
		{
			String childwiwindow1 = i.next();
			
			
			if(!parentwindow.equalsIgnoreCase(childwiwindow1))
			{
				driver.switchTo().window(childwiwindow1);
				WebElement download = driver.findElement(By.linkText("Downloads"));
				download.click();
				Thread.sleep(2000);
				driver.close();
			}
			
			
		}

		Thread.sleep(2000);
        driver.switchTo().window(parentwindow) ;
       // driver.switchTo().defaultContent();   second way
	}

}
