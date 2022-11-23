package com.section2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Internet_herokuapp_frame_file {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//inspect the no.of frame then, change the driver focus to frame
		//index
		//driver.switchTo().frame(0); //only one frame so,index value starts from 0
		
		//id or name attribute value
		//driver.switchTo().frame("mce_0_ifr");	
		
		//webElement
		WebElement frame1=driver.findElement(By.className("tox-edit-area__iframe"));
		driver.switchTo().frame(frame1); 
		
		//fetch msg to check driver focus is on frame
		String msg=driver.findElement(By.tagName("p")).getText();	
		System.out.println(msg); //Your content goes here.
		
		//change the driver focus to main page(here main page is same as parent page)
		driver.switchTo().defaultContent();
		
		//click on file to check the driver focus on main page(It will show"New document")
		driver.findElement(By.xpath("//span[text()='File']")).click(); 
	}

}
