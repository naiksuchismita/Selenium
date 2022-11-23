package com.section1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn6 {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			//NOT GENERIC TC
			//use random cls to create new new customer name every time
			Random r=new Random(); //create obj of random cls
			int num=r.nextInt(10000);
			String expcustomername="Pooh";
			expcustomername=expcustomername+num;
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//go to actitime
			driver.get("http://demo.actitime.com/login.do");
			//login
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(3000);
			driver.findElement(By.id("keepLoggedInCheckBox")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			//click on task
			
			driver.findElement(By.id("container_tasks")).click();
			Thread.sleep(2000);
			//add new+
			//she took (By.cssSelector(".title.ellipsis"))
			driver.findElement(By.className("plusIcon")).click();
			//create New Customer
			driver.findElement(By.className("createNewCustomer")).click();
			Thread.sleep(3000);
			//enter customer name
			driver.findElement(By.className("newNameField")).sendKeys(expcustomername);
			Thread.sleep(3000);
			//customer description(By.xpath("//textarea[@placeholder='Enter Customer Description']"))
			driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("Student");
			//create
			driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
			Thread.sleep(3000);
			//forward traversing
			String actualcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
			System.out.println(actualcustomername);
			if(expcustomername.equals(actualcustomername))
			{
				System.out.println("TC is passed");
			}
			else
			{
				System.out.println("TC is failed");
				
			}
				

		}

	}



