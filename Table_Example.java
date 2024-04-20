package com.MainApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Example {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		
		List<WebElement> column = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int size=column.size();
		System.out.println("total no of colum are:"+size);
		
		for(int i=0; i<size; i++)
		{
			String columnName=column.get(i).getText();
			System.out.println(columnName);
//			if(columnName.equalsIgnoreCase("Company"))
//			{
//				System.out.println("We have column name as per the requirement");
//				
//			}
		}
		//to fetch the all row from table
		System.out.println("--------------------------------------------------");
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int size1 = rows.size();
		System.out.println("total no of row are:"+size1);
        
		for(int j=0; j<size1; j++)
		{
			String rowName=rows.get(j).getText();
			System.out.println(rowName);
		}	
		
		// to fetch the cell data we will use be code
		System.out.println("--------------------------------------------------");
		WebElement celldata =driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[4]"));
		System.out.println(celldata.getText());
		
	}

}
