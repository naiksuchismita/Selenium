package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyFlpkrtTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); //ExplicitWait
		wait.until(ExpectedConditions.titleContains("Iphonex"));
		
		System.out.println(driver.getTitle());
		
	}

}
