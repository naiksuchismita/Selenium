package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIMLocationDimensionHtWidth {
	//Point getLocation() //Dimension getize() //Rectangle getRect()

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		WebElement username=driver.findElement(By.id("username"));
		//Location of x and y co-ordinate
		Thread.sleep(2000);
		Point location=username.getLocation();
		System.out.println(location);
		Thread.sleep(2000);
		//Dimension(size) or width and height
		Dimension size=username.getSize();
		System.out.println(size);
		Thread.sleep(2000);
		//x,y, width and height
		Rectangle rec=username.getRect();
		System.out.println(rec.getX());
		System.out.println(rec.getY());
		System.out.println(rec.getWidth());
		System.out.println(rec.getHeight());
		
		

	}

}
