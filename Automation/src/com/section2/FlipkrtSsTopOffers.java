package com.section2;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkrtSsTopOffers {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement flipkart=driver.findElement(By.xpath("[contains(@class,'InyRMC')]"));
		//WebElement flipkart=driver.findElement(By.xpath("//div[@id='container']/div/div[2]"));
		Thread.sleep(2000);
		File src=flipkart.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/flipkart.png");           
		FileUtils.copyFile(src, trg);
		driver.close();
	}

}
//div[@id='container']/div/div[2]