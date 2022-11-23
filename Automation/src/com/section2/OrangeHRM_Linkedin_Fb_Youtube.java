package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Linkedin_Fb_Youtube {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]")).click();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			driver.switchTo().window(id);
			String title=driver.getTitle();
			if(!title.contains("YouTube"))
			{
				driver.close();
			}
			else
			{
				System.out.println(title);                                             
			}
		}
//		String mainid=driver.getWindowHandle();
//		Set<String> allid=driver.getWindowHandles();
//		for(String id:allid)
//		{
//			driver.switchTo().window(id);
//			String title=driver.getTitle();
//			if(title.equals("OrangeHRM Inc - Youtube"))
//			{
//				System.out.println(driver.getTitle());
//			}
//			else
//			{
//				driver.close();                                             
//			}
//		}
		
		
	}

}
