package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedIsEnableIsSelected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Diksha Document\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
        
		 WebDriver driver = new ChromeDriver();
				
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		/*boolean result = username.isDisplayed();
		boolean result1= username.isEnabled();
		System.out.println(result);
		System.out.println(result1); */
		
		
	    WebElement password = driver.findElement(By.id("pass"));
	   /* boolean passresult = password.isDisplayed();
		boolean passresult1= password.isEnabled();
		System.out.println(passresult);
		System.out.println(passresult1); */
	    
	    
	  // is Displayed method used to element is present or not and 
	  // IsEnabled method is  used to element is visible or disable
	    if(username.isDisplayed() && username.isEnabled())
	    {
	    	username.sendKeys("zadediksha@gmail.com");
	    }
	    else
	    {
	    	System.out.println("username incorrect ");
	    }
	    
	    if(password.isDisplayed() && password.isEnabled())
	    {
	    	password.sendKeys("Diksha@123");
	    
	    }
	    
	    else
	    {
	    	System.out.println("password incorrect ");
	    }
	  
	    // is selected method is used to validate the checkbox or radio button is already selected or not
      WebElement checkbox = driver.findElement(By.id("persist_box"));
      boolean checkresult = checkbox.isSelected();
      System.out.println(checkresult);
      
      if(checkresult== true)
      {
    	System.out.println("check box is selected");  
      }
      
      else
      {
    	  System.out.println("check box is not selected");
      }
	}

}
