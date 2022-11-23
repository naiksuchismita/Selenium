package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToStringUrlWthoutGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Browser server configuration
				System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
				//Launch Chrome Browser
				ChromeDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//Open Amazon
				driver.navigate().to("https://www.amazon.in/");
				

	}

}
