package com.MainApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		// to click on the single checkbox we need to find out the element need to click
//		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox1']"));
//		checkbox.click();
//		
//		
//		// to check the checkbox is already selected or not
//		if(checkbox.isSelected())
//		{
//			System.out.println("Checkbox is selected ");
//		}
//		
//		else
//		{
//			System.out.println("check box is not selected");
//		}
		
		// to select the  multiple checkbox inn single code we will use below code
		List<WebElement> checkbox = driver.findElements(By.xpath("//*[@type='checkbox']"));
		int size = checkbox.size();
		System.out.println("Checkbox size is :"+size);
		
		//checkbox.get(0).click();
		
//		for(int i=0; i<size; i++)
//		{
//			checkbox.get(i).click();
//
//		}
		
		// for dynamic way
		
		for(int i=0; i<size; i++)
		{
			// get attribute use to fetch the value of element attribute as per the given key
			String value = checkbox.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("Cricket"))
			{
				checkbox.get(i).click();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
