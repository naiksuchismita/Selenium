package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium08BlogSpot_Railway_FrameNeeraj {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300);");
		//jse.executeScript("arguments[0].scrollIntoView(true)", wb);
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame("iframe_a");
		
		//WebElement wb=driver.findElement(By.linkText("Free Mock Tests"));
		//wb.click();//Free Mock Tests
		
		//driver.findElement(By.xpath("//font[text()='Free Mock Tests']")).click();
		driver.findElement(By.linkText("Free Mock Tests")).click(); //free mock test 

		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!(mainid.equals(id)))
			{
				driver.switchTo().window(id);
			}
			
		}
		//driver.findElement(By.linkText("Railways")).click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-left hide-in-mobile']/li[4]/a")).click(); //railways
		driver.findElement(By.xpath("//a[text()='RRB NTPC Stage 1']")).click(); //rrb ntpc

		//driver.findElement(By.linkText("RRB NTPC Stage 1")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
