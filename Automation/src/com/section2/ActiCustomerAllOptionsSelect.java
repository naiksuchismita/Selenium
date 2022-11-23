package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiCustomerAllOptionsSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.className("popup_menu_button_settings")).click(); //setting button
		driver.findElement(By.xpath("//div[contains(text(),'Manage system settings')]/..")).click(); //general setting
		WebElement dd=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));//customer dropdown
		Select s=new Select(dd);
		List<WebElement> alloption=s.getOptions();
		for(WebElement op:alloption)
		{
			System.out.println(op.getText());
		}
		driver.close();		
	}

}
