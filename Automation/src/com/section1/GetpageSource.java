package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetpageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);

	}

}
