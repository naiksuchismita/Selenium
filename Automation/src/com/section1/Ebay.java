package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
	
	}
}
