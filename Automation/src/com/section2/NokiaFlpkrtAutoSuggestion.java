package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NokiaFlpkrtAutoSuggestion {
	//not completed

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Nokia");
		List<WebElement> allsuggestions=driver.findElements(By.xpath("//form[contains(@class,'header-form-search')]/ul/li"));
		//List<WebElement> allsuggestions=driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li/div/a/div[2]")); 
		//List<WebElement> allsuggestions=driver.findElements(By.xpath("//input[@name='q']/../../../ul/li")); 
		//List<WebElement> allsuggestions=driver.findElements(By.xpath("//div[contains(@data-tkid,'nokia mobiles smartphones')]/../../li"));


		for(WebElement suggestion:allsuggestions)
		{
			System.out.println(suggestion.getText());
		}
		driver.close();
		
				
	}

}
