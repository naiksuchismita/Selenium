package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
//Browser Server Configuration
	System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
//launch chrome browser
ChromeDriver driver=new ChromeDriver();
//open amazon
driver.get("https://www.amazon.com/");
}
}