package com.section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Internet_herokuapp_Alert_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt=driver.switchTo().alert();
		//fetch msg
		String msg=alt.getText();
		System.out.println(msg); //I am a JS prompt //to check whether driver is focused to alert popup or not
		//pass hey
		alt.sendKeys("hey");
		//press ok
		alt.accept();
		
		//to check whether the driver is returned to main page or not
		String result=driver.findElement(By.id("result")).getText();
		System.out.println(result); //you entered:hey
	}

}
