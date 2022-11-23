package com.section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Movies_getAllSelectedOptions_getFirstSelectedOption {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("C:/Users/suchi/Documents/WebElement/Multi%20Select%20Dropdown.html");
		WebElement mv=driver.findElement(By.id("Movies"));
		Select s=new Select(mv);
		
		//select harry potter, narnia, percy jackson
		s.selectByVisibleText("Narnia");
		Thread.sleep(10);
		s.selectByVisibleText("Percy Jackson");
		Thread.sleep(10);
		s.selectByVisibleText("Harry Potter");
		Thread.sleep(10);
		
		//get all selected options
		List<WebElement> allselectedopt=s.getAllSelectedOptions();
		for(WebElement opt:allselectedopt)
		{
		System.out.println(opt.getText());
		}
				
		//get the first selected option in dropdown(not in program)
		String firstopt=s.getFirstSelectedOption().getText();
		System.out.println(firstopt); 
		
	
		}

}
