package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLoc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		//[placeholder='Username']
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
		//[class='textField pwdfield']
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("[name='remember']")).click();
		driver.findElement(By.cssSelector("[id='loginButton']")).click();
		
		


	}

}
