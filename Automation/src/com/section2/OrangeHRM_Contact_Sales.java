package com.section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Contact_Sales {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']/ul/li[2]/a/button")).click(); //contact sales
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Suchismita Naik"); //full name
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9124740092"); //ph no.
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("suchismitanaik161296@gmail.com"); //email
		driver.findElement(By.id("Form_getForm_Country")).sendKeys("India"); //country
		driver.findElement(By.id("Form_getForm_NoOfEmployees")).sendKeys("101"); //No. Of Employees
		driver.findElement(By.name("JobTitle")).sendKeys("Engineer"); //job title
		driver.findElement(By.id("Form_getForm_Comment")).sendKeys("Good Morning"); //Message
	//	driver.findElement(By.className("recaptcha-checkbox-border")).click(); //checkbox
	//	driver.findElement(By.name("action_submitForm")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//driver.close();	
		}

}
