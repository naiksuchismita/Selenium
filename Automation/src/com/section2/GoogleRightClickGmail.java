package com.section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleRightClickGmail {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions act=new Actions(driver);
		//act.contextClick(gmail).perform(); //contextClick(WebElement)
		act.moveToElement(gmail).contextClick().build().perform(); //contextClick(),if you want to use this with "moveToElement(WebElement)", add build() also

		Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_PAGE_DOWN); //This way also we can write
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		
		}

}
