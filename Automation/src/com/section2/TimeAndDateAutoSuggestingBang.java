package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeAndDateAutoSuggestingBang {
	//doubt

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/");
		driver.findElement(By.xpath("//div[@class='four columns c-wc med-6']/div/div[2]/div/form/input")).sendKeys("bang");
		//List<WebElement> allsuggestions=driver.findElements(By.xpath("//ul[@class='asu']/li"));

		List<WebElement> allsuggestions=driver.findElements(By.xpath("//span[@class='mnx']/../../..")); 

		for(WebElement suggestion:allsuggestions)
		{
			System.out.println(suggestion.getText());
		}
		driver.close();
		
	}

}
