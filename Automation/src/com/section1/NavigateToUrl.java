package com.section1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUrl {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//Browser server configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		//Launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Open Google
		URL url=new URL("https://www.google.co.in/");
		driver.navigate().to(url);
		


	}

}
