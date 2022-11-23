package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgnmnt6Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//OLD ONE
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
		driver.findElement(By.className("plusIcon")).click();
		//create New Customer
		driver.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(3000);
		//enter customer name
		driver.findElement(By.className("newNameField")).sendKeys("Suchismita");
		Thread.sleep(3000);
		//customer description
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Student");
		//create
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(3000);
		String result=driver.findElement(By.cssSelector("[title='Suchismita']")).getText();
		System.out.println(result);

	}

}
