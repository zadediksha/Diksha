package com.MainApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Example {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		WebElement radio = driver.findElement(By.xpath("//*[@value=\"Male\"]"));
		//radio.click();
		
		// to check the Radio button is already selected or not
//		if (radio.isSelected())
//		{
//			System.out.println("radio button is selected");
//		}
//		
//		else
//		{
//			radio.click();
//		}
		
		// dynamic radio button
		
		List<WebElement> radiobuttons = driver.findElements(By.xpath("//*[@type='radio']"));
		for(int i=0; i<radiobuttons.size(); i++)
		{
		 String value = radiobuttons.get(i).getAttribute("value");
		 
		 if(value.equalsIgnoreCase("male"))
		 {
			 radiobuttons.get(i).click();
		 }
		 
		
			 
	
		
		}
		 
	
		
		

	}

}
