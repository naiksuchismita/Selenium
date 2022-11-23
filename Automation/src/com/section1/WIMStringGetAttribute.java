package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIMStringGetAttribute {
	//String getAttribute(String name)

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		WebElement username=driver.findElement(By.id("username"));
		String value=username.getAttribute("placeholder");
		System.out.println(value); //Username
		String value1=username.getAttribute("class");
		System.out.println(value1); //textfield
		

	}

}
