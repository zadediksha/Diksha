package com.MainApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedTable_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
		driver.manage().window().maximize();
		
		
		List<WebElement> nestedTableRow = driver.findElements(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr"));
         int size = nestedTableRow.size();
         
         for(int i=0; i<size; i++)
         {
        	 String value =nestedTableRow.get(i).getText();
        	 System.out.println(value);
         }
		
		//for single value fetch
//		WebElement value = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]"));
//		String singval = value.getText();
//		System.out.println(singval);
         }

}
