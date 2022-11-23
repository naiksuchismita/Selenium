package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_watchAdvRXpath {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		Ebay_watchAdvRXpath ew=new Ebay_watchAdvRXpath();
		ew.launchBrowser();	
		ew.search();
		ew.result();
		ew.closeBrowser();
	}
	
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public void search() throws InterruptedException
	{
		driver.get("https://www.ebay.com/"); //open ebay
		Thread.sleep(3000);
		driver.findElement(By.name("_nkw")).sendKeys("Watches"); //type Watches
		Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).click(); //click on google search button
		Thread.sleep(2000);
	}
	
	public void result()
	{
		String result=driver.findElement(By.className("srp-controls__count-heading")).getText(); //fetch result
		System.out.println(result);
		
	}
	public void closeBrowser()
	{
	driver.close();
	}

	}


