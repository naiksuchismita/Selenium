package com.section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonBrandSolimo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		search.sendKeys("clock");
		Thread.sleep(3000);
		//Object creation
		Actions act=new Actions(driver);
		//act.keyUp(Keys.SHIFT).sendKeys(search,"Clock").perform();
		//Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).sendKeys("a",Keys.DELETE).perform();
		Thread.sleep(3000);
		act.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		//act.keyDown(Keys.SHIFT).sendKeys(search,"fLOWER",Keys.ENTER).perform();
		search.sendKeys("flower");
		search.submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/li[8]/span/div/a/span")).click();//brands-see more
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[aria-label='Amazon Brand - Solimo']")).click(); //click on amazon brand
		Thread.sleep(3000);
		String result=driver.findElement(By.cssSelector(".a-section.a-spacing-small.a-spacing-top-small")).getText();//result
		System.out.println(result);
		driver.close();
		

	}

}
