package com.section2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jqueryui_date_calender_Java_DateOfBirth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();//textbox
		
		String month=driver.findElement(By.className("ui-datepicker-month")).getText(); //month
		String year=driver.findElement(By.className("ui-datepicker-year")).getText();	//year
		
		while(!(month.equals("December") && year.equals("1996")))
		{
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); 
			driver.findElement(By.xpath("//span[text()='Prev']")).click(); //previous month button
			month=driver.findElement(By.className("ui-datepicker-month")).getText(); //month
			year=driver.findElement(By.className("ui-datepicker-year")).getText(); //year
		}
		
		driver.findElement(By.linkText("16")).click();  //date
		//String date=driver.findElement(By.linkText("16")).getText();
		//System.out.println(date+"/"+month+"/"+year);
	}

}
