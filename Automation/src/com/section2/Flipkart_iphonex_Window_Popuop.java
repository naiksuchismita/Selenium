package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_iphonex_Window_Popuop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();//cross mark
		driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);//search iphonex
		driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 256 GB)']")).click(); //inspect name
		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!(id.equals(mainid)))
				{
				driver.switchTo().window(id);
				}
		}
		//to check whether the driver focus is now on child window, we will fetch the ph price
		String price=driver.findElement(By.className("CEmiEU")).getText();
		System.out.println(price);
		driver.close(); //to see which window is closing-child window is closed
		//now, driver focus is on child window ,so bring it back to main window ,if you want to handle the main window
		driver.switchTo().window(mainid);
		System.out.println(driver.getTitle());

	}

}
