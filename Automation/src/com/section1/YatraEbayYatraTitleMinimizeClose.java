package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class YatraEbayYatraTitleMinimizeClose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Mandatory line
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		//wait statement
		Thread.sleep(3000);
		driver.get("https://www.ebay.com/");
		//Back
		Thread.sleep(3000);
		driver.navigate().back();
		driver.get("https://www.yatra.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.close();
		
		
		


	}

}
