package com.section1;



import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		//Launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		//Open Google
		driver.get("https://www.google.com/");
		//wait statement
		Thread.sleep(3000);
		//change position of the browser
		driver.manage().window().setPosition(new Point(400,600));


	}

}
