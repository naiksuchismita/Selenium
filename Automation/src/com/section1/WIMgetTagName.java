package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIMgetTagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.name("pwd"));
		System.out.println(password.getTagName());
		WebElement wb2=driver.findElement(By.id("loginForm"));
		System.out.println(wb2.getTagName());
		WebElement wb3=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(wb3.getTagName());
		
		//driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//Thread.sleep(3000);
		//driver.findElement(By.id("keepLoggedInCheckBox")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(3000);
		//WebElement wb4=driver.findElement(By.className("menu_icon"));
		//System.out.println(wb4.getTagName());
	}

}
