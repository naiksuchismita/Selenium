package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIMgetAriaRole {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.name("pwd"));
		System.out.println(password.getAriaRole());
		WebElement wb1=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(wb1.getAriaRole());
		WebElement wb2=driver.findElement(By.id("loginButtonContainer"));
		System.out.println(wb2.getAriaRole());
		//WebElement wb3=driver.findElement(By.id("loginButton")); //why i am getting this as link
		//System.out.println(wb3.getAriaRole());
		
	}

}
