package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium08BlogSpot_DoubleClick_Click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement share=driver.findElement(By.xpath("//span[text()='Labels:']/../../../../div[2]/div/div/button"));
	
		Actions act=new Actions(driver);
		//Double click action on SHARE
		act.doubleClick(share).perform();
		//act.moveToElement(share).doubleClick().build().perform();
		
		//click action
		act.click(share).perform();
		
		
	}

}
