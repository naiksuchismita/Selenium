package com.section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAmazonClock {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		search.sendKeys("clock");
		Thread.sleep(3000);
		//Object creation
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("a",Keys.DELETE).perform();
		Thread.sleep(3000);
		act.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		
		search.sendKeys("flower");
		search.submit();
		Thread.sleep(3000);
		String result=driver.findElement(By.cssSelector(".a-section.a-spacing-small.a-spacing-top-small")).getText();
		System.out.println(result);
		driver.close();
	}

}
