package com.section2;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_NewTab_Flipkart_NewWindow_Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//open amazon by default
		driver.get("https://www.amazon.in/");
		//open new blank TAB
		driver.switchTo().newWindow(WindowType.TAB);
		//open flipkart in that TAB
		driver.get("https://www.flipkart.com/"); //by default driver is focusing on this new tab so flipkart will open here only in this new tab
		//open new WINDOW from that TAB
		driver.switchTo().newWindow(WindowType.WINDOW);
		//open google in that window
		driver.get("https://www.google.com/");
	}

}
