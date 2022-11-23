package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIMisDisplayedActi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.name("pwd"));
		System.out.println(password.isDisplayed());
		WebElement wb2=driver.findElement(By.id("loginForm"));
		System.out.println(wb2.isDisplayed());

		
	}

}
