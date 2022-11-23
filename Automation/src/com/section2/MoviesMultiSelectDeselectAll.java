package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MoviesMultiSelectDeselectAll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("C:/Users/suchi/Documents/WebElement/Multi%20Select%20Dropdown.html");
		WebElement mv=driver.findElement(By.id("Movies"));
		Select s=new Select(mv);
		
		//select harry potter, narnia, percy jackson
		s.selectByVisibleText("Harry Potter");//harry potter
		s.selectByVisibleText("Narnia");//narnia
		s.selectByVisibleText("Percy Jackson");//percy jackson
		
		//deselect narnia
		s.deselectByVisibleText("Narnia");
		
		//at a time deselect harry potter & percy jackson
		s.deselectAll();
		
		
	}

}
