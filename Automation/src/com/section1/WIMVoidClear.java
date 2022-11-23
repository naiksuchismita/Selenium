package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIMVoidClear {
	//void clear()

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		WebElement un=driver.findElement(By.id("username"));
		Thread.sleep(2000);
		un.sendKeys("admin");
		Thread.sleep(2000);
		un.clear();
		Thread.sleep(2000);
		un.sendKeys("admin123");
		
	}

}
