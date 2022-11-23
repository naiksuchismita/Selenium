package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cowin {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.cowin.gov.in/");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
	}
	

}
