package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args){
//browser server configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
//launch chrome browser		
ChromeDriver driver=new ChromeDriver();
//open flipkart
driver.get("https://www.flipkart.com/");
}
}