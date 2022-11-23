package com.section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSeleniumActionsCls {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");		
		WebElement search=driver.findElement(By.name("q"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(search,"selenium").perform();
		act.keyUp(Keys.SHIFT).sendKeys(search,"Selenium").perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		
		

	}

}
