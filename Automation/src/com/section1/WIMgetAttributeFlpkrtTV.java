package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIMgetAttributeFlpkrtTV {
	//getAttribute("value");

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		WebElement searchTV=driver.findElement(By.name("q"));
		searchTV.sendKeys("television");
		Thread.sleep(2000);
		String t=searchTV.getAttribute("value"); 
		System.out.println(t);
				
		
		
		

		
	}

}
