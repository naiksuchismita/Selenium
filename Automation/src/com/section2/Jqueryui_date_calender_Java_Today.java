package com.section2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jqueryui_date_calender_Java_Today {
	//Select todays's date by using Java Approach

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		//in java we have a class called as Calender, 
		//inside, it has a method called as getInstance()(it will fetch the default time or particular time zone)
		Calendar cal=Calendar.getInstance(); //calender is return type
		
		// by using the cal ref we have to call another one method-getTime()-
		//this method will fetch the particular current date and time
		Date currentDate=cal.getTime(); //returntype is Date
		
		System.out.println(currentDate); //how current date is fetching
		
		//object creation to convert the date format to MM/dd/yyyy
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		String modifiedDate=sdf.format(currentDate); //by using ref sdf, call method format(), returntype of format() is String
		System.out.println(modifiedDate); //print modified date
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).sendKeys(modifiedDate,Keys.ESCAPE); //pass it into the calender
	}

}
