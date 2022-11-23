package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShortcutId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.cssSelector("[id='keepLoggedInCheckBox']")).click();
		driver.findElement(By.cssSelector("[id=loginButton]")).click();

	}

}
