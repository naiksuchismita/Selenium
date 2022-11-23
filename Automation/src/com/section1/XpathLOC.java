package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLOC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//cross mark
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//search for iphone
		driver.findElement(By.name("q")).sendKeys("iphone");
		//search button
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(3000);
		String result=driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		System.out.println(result);

	}

}
