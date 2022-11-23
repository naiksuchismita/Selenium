package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnFlpkrtShortcut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//you can take one attribute value also, it is working(std procedure)
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._3704LK")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._34RNph")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}

}
