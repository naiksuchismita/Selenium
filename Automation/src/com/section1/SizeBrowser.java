package com.section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		//Launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		//Open Google
		driver.get("https://www.google.com/");
		//wait statement
		Thread.sleep(3000);
		//fullScreen browser
		driver.manage().window().setSize(new Dimension(400,600));

	}

}
