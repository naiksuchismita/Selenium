package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardRefresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Mandatory line
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//wait statement
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/");
		//Back
		Thread.sleep(2000);
		driver.navigate().back();
		//forward
		Thread.sleep(2000);
		driver.navigate().forward();
		//refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		


	}

}
