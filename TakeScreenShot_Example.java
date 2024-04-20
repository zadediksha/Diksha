package com.MainApp;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class TakeScreenShot_Example {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		// firstly we are creating refereance of take screenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		// calling getscreenshot method to create image 
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		
		// move the file into new destination folder
		
		File destfile = new File("C:\\Users\\aksha\\OneDrive\\Desktop\\temp\\error.png");
		
		// copy screenshot
		Files.copy(srcfile, destfile);

	}

}
