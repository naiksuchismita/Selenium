package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitActitimeCustomerChkboxDel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		
		
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//table[@class='headerRowTable']/tbody/tr/td/div/div")).click();
		//driver.findElement(By.xpath("//div[@class='kanbanView_components_taskCard statusColor_yellow cardWithCheckbox']/div/label")).click();
		
		driver.findElement(By.xpath("//div[@class='innerScrollableContainer']/table/tbody/tr/td")).click();//not working now
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
		Thread.sleep(2000);
		
		String del=driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
		System.out.println(del); 
	
		driver.close();

	}

}
