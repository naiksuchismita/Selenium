package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIMActitimeWork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings")).click(); //setting button
		Thread.sleep(3000);
		driver.findElement(By.linkText("Types of Work")).click(); //types of work
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click(); //create type of work
		//driver.findElement(By.xpath("//td[contains(text(),'Create New Type of Work')]")).getText(); //fetch
		String result=driver.findElement(By.xpath("//td[contains(text(),'Create New Type')]")).getText(); //fetch
		System.out.println(result);
		
	}

}
