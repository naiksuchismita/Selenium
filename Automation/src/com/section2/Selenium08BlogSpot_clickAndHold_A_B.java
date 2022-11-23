package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium08BlogSpot_clickAndHold_A_B {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement boxA=driver.findElement(By.name("A"));
		WebElement boxB=driver.findElement(By.name("B"));

		Actions act=new Actions(driver);
		//Click and hold box A
		//act.clickAndHold(boxA).perform();
		
		//Click and hold box A,Move to box B,Release box A to original place
		 act.clickAndHold(boxA).moveToElement(boxB).release().build().perform();
		
	}

}
