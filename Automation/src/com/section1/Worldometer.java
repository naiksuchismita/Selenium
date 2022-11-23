package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldometer {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Worldometers wm=new Worldometers();
		wm.launchBrowser();
		String cvcases=wm.coronaCases();
		System.out.println(cvcases);
		String dcases=wm.deathCases();
		System.out.println(dcases);
		String rcases=wm.recoveredCases();
		System.out.println(rcases);
		wm.closeBrowser();
		
	}

	public void launchBrowser() throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	public String coronaCases() throws InterruptedException
	{
		driver.get("https://www.worldometers.info/coronavirus/");
		Thread.sleep(2000);
		String count=driver.findElement(By.cssSelector("[style='color:#aaa']")).getText();
		return count;
	}
	
	public String deathCases() throws InterruptedException
	{
		
		Thread.sleep(2000);
		String count=driver.findElement(By.xpath("//h1[text()='Deaths:']/../div[1]/span")).getText();
		return count;	
	}
	
	public String recoveredCases() throws InterruptedException
	
	{
		
		Thread.sleep(2000);
		String count=driver.findElement(By.xpath("//h1[text()='Recovered:']/../div[1]/span")).getText();
		return count;
		
	}
	public void closeBrowser()
	{
	driver.close();
	}



	}


