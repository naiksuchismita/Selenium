package com.section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Naukri_jobs_Screenshot_PrivacyPolicy {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable_notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		WebElement job=driver.findElement(By.xpath("//div[text()='Jobs']")); //jobs
		Actions act=new Actions(driver);
		act.moveToElement(job).perform();
		
		driver.findElement(By.xpath("//div[text()='IT jobs']")).click(); //IT jobs
		driver.findElement(By.xpath("//a[text()='Embedded Test Engineer']")).click();
		//driver.findElement(By.xpath("//div[@class='list']/article/div/div")).click(); //Embedded Test Engineer
		
		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!(id.equals(mainid)))
				{
				driver.switchTo().window(id);
				}
		}
		
		WebElement connect=driver.findElement(By.className("nI-gNb-followus"));
		File src=connect.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/connect.png");
		FileUtils.copyFile(src, trg);
		
		driver.findElement(By.xpath("//a[text()='Privacy policy']")).click(); //privacy policy
		//driver.findElement(By.linkText("Privacy policy")).click(); //privacy policy
		String title=driver.getTitle();
		System.out.println(title); //Privacy Policy - Naukri.com

		
		

	}

}
