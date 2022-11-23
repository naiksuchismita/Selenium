package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlpkrtSurrndngRXpth {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String productname="APPLE iPhone X (Silver, 64 GB)";
		FlpkrtSurrndngRXpth fiph=new FlpkrtSurrndngRXpth();
		fiph.launchBrowser();	
		fiph.search();
		Thread.sleep(2000);
		String price=fiph.fetchPrice(productname);
		System.out.println(price);
		fiph.closeBrowser();
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
		driver.get("https://www.flipkart.com/"); //open flipkart
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//search for iphone
		driver.findElement(By.name("q")).sendKeys("iphonex");
		//search button
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(3000);
		
	}
	
	public String fetchPrice(String productname)
	{
		String price=driver.findElement(By.xpath("//div[text()='"+productname+"']/../../div[2]/div[1]/div[1]/div")).getText();
		return price;
		
	}
	public void closeBrowser()
	{
		driver.close();

	}




	}


