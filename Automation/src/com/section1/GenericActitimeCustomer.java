package com.section1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericActitimeCustomer {
	ChromeDriver driver; //to make it global(from launchBrowser()) so that we can access
	
	public static void main(String[] args) throws InterruptedException {
		 
		Random r=new Random(); 
		int num=r.nextInt(10000);
		String expcustomername="Pooh";
		expcustomername=expcustomername+num;
		GenericActitimeCustomer ac=new GenericActitimeCustomer();
		ac.launchBrowser();
		ac.login();
		Thread.sleep(2000);
		String actualcustomername=ac.customerCreation(expcustomername);
		if(expcustomername.equals(actualcustomername))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
			
		}
		ac.closeBrowser();
	}
		public void launchBrowser()
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		
		public void login() throws InterruptedException
		{
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		}
		
		public String customerCreation(String expcustomername) throws InterruptedException
		{
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("plusIcon")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("newNameField")).sendKeys(expcustomername);
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("Student");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
		String actualcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		return actualcustomername;
		}
		
		public void closeBrowser()
		{
		driver.close();
		}
	}

	
	

