package com.section2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViratPhotosAutoSuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//go to google
		driver.get("https://www.google.com/");
		//search for virat
		driver.findElement(By.name("q")).sendKeys("virat");
		List<WebElement> allsuggestions=driver.findElements(By.xpath("//ul[@class='erkvQe']/div[1]/ul/li"));
		for(WebElement suggestion:allsuggestions)
		{
			
			String suggname=suggestion.getText();
			
			if(suggname.contains("photos"))
			{
				suggestion.click();
				break;
			}
		}
		driver.close();		
	}

}
