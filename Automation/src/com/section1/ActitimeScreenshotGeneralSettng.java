package com.section1;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeScreenshotGeneralSettng {
	WebDriver driver;
	
	

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ActitimeScreenshotGeneralSettng actiss=new ActitimeScreenshotGeneralSettng();
		actiss.launchBrowser();
		actiss.login();
		actiss.actime();
		actiss.screenshot();
		
	}

		public void launchBrowser() throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(3000);
		}
		
		public void login() throws InterruptedException
		{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		}
		
		public void actime() throws InterruptedException
		{
			//(By.className("popup_menu_button_settings")
		driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings")).click(); //setting button
		Thread.sleep(3000);
		//driver.findElement(By.id("popup_menu_item_6")).click(); //General Setting
		//driver.findElement(By.xpath("//div[contains(text(),'Manage system settings')]/.."));
		driver.findElement(By.xpath("//ul[@id='popup_menu_items_content']/li[4]")).click(); //General Setting

		}
		
		public void screenshot() throws IOException
		{
			WebElement gensett=driver.findElement(By.xpath("//td[text()='General Settings']"));
			//td[text()='General Settings']
			File src=gensett.getScreenshotAs(OutputType.FILE);
			File trg=new File("./Screenshot/gensett.png");
			FileUtils.copyFile(src, trg);
			driver.close();
			
		}

	}


