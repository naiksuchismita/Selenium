package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIMgetAttributevalue {
	// String getAttribute("value")

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin123"); //this will be hidden during interview
		String value=username.getAttribute("value");
		System.out.println(value);
		

	}

}
