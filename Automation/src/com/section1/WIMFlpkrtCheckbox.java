package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIMFlpkrtCheckbox {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		//search for iphonex
		WebElement ip=driver.findElement(By.name("q"));
		ip.sendKeys("iphonex");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//ip.submit();
		Thread.sleep(3000);
		//try with index also
		driver.findElement(By.xpath("//div[@data-id='MOBEXRGVF8NHMGXJ']/div/a/div/div[2]/div/span/label/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-id='MOBFWBYZXSEGBS6F']/div/a/div/div[2]/div/span/label/div")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
