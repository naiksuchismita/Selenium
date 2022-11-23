package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//browser server configuration
				System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		//launch chrome browser		
		ChromeDriver driver=new ChromeDriver();
		//open flipkart
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.com/");

	}

}
