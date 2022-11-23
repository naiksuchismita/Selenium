package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeWElemntinterfacemethod {
	//isSelected

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		WebElement cb=driver.findElement(By.id("keepLoggedInCheckBox"));
		 if(cb.isSelected())
		 {
			 System.out.println("it is selected");
		 }
		 else
		 {
			 
			 System.out.println("it is not selected");
			 cb.click();
		 }
		 
		 
		 
		 
		 
	}

}
