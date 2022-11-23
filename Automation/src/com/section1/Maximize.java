package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;


public class Maximize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Browser server configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		//Launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		//Open Google
		driver.get("https://www.google.com/");
		//wait statement
		Thread.sleep(2000);
		//maximize the browser
		driver.manage().window().maximize();
		
	}

	
	}

	
	

