package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SachinAdvncRXpth {
	ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		SachinAdvncRXpth st=new SachinAdvncRXpth();
		st.launchBrowser();	
		st.search();
		st.result();
		st.closeBrowser();
		
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
		driver.get("https://www.google.com/"); //open google
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Sachin Tendulkar"); //type sachin tendulkar
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click(); //click on google search button
		Thread.sleep(2000);
	}
	
	public void result()
	{
		String result=driver.findElement(By.id("slim_appbar")).getText(); //fetch result
		System.out.println(result);
		
	}
	public void closeBrowser()
	{
		driver.close();
	}
}
