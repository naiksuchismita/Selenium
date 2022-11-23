package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnmtLocActi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//change the locator for check box,it is not working for name("remember")
		driver.findElement(By.name("remember")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		driver.get("https://demo.actitime.com/user/submit_tt.do");
		String title=driver.getTitle();
		System.out.println(title);
		


	}

}
