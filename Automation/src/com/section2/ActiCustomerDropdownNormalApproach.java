package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiCustomerDropdownNormalApproach {
	//normal findElement approach

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.className("popup_menu_button_settings")).click(); //setting button
		driver.findElement(By.xpath("//div[contains(text(),'Manage system settings')]/..")).click(); //general setting
		WebElement dd=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));//customer dropdown
		dd.click();
		driver.findElement(By.xpath("//option[text()='Product Line']")).click();
		dd.click();
		
	}

}
