package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdIndicator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		By usernameLoc=By.id("username");
		WebElement username=driver.findElement(usernameLoc);
		username.sendKeys("admin");
		
			
		}

	}


