package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\suchi\\Documents\\WebElement\\Registration.html");
		//username
		driver.findElement(By.xpath("//input[1]")).sendKeys("Suchismita");
		//email
		driver.findElement(By.xpath("//input[3]")).sendKeys("suchismita@xyz");
		//Accept T&C
		driver.findElement(By.xpath("//input[7]")).sendKeys("Suchismita");

	}

}
