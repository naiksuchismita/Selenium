package com.section2;

import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeCustomerImplicit {
	

	public static void main(String[] args) throws InterruptedException {
		Random r=new Random(); 
		int num=r.nextInt(10000);
		String expcustomername="Pooh";
		expcustomername=expcustomername+num;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//go to actitime
		driver.get("http://demo.actitime.com/login.do");
		//login
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		driver.findElement(By.id("loginButton")).click();
		
		
		//click on task
		driver.findElement(By.id("container_tasks")).click();
		//add new+
		driver.findElement(By.className("plusIcon")).click();
		//driver.findElement(By.cssSelector(".title.ellipsis")).click();

		//create New Customer
		driver.findElement(By.className("createNewCustomer")).click();
		//enter customer name
		driver.findElement(By.className("newNameField")).sendKeys(expcustomername);
		//customer description(By.xpath("//textarea[@placeholder='Enter Customer Description']"))
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("Student");
		//create
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		//forward traversing-fetch the customer name
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"),expcustomername));
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