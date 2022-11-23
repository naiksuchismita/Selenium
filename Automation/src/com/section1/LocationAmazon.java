package com.section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		//Launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		//Open Amazon
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		//change location or position of the browser
		driver.manage().window().setPosition(new Point(400,600));
		//wait statement
		Thread.sleep(3000);
		//fullScreen browser
		driver.manage().window().setSize(new Dimension(400,600));

	}

}
