package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIMBoolean_isEnabled {
	//boolean isEnabled

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\suchi\\Documents\\WebElement\\Registration1.html");
		WebElement username=driver.findElement(By.cssSelector("[placeholder='Username']"));
		Thread.sleep(2000);
		if(username.isEnabled())
		{
			System.out.println("it is enabled");
		}
		else
		{
			System.out.println("it is disabled");
		}

	}

}
