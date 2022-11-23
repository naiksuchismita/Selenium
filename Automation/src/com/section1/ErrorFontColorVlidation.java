package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorFontColorVlidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement errormsg=driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid')]"));
		String fontsize=errormsg.getCssValue("font-size");
		System.out.println(fontsize);
		String actual="Username or Password is invalid. Please try again.";
		String expected=errormsg.getText();
		if(actual.equals(expected))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}

	}

}
