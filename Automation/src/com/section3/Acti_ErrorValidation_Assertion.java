package com.section3;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Acti_ErrorValidation_Assertion{
	//doubt
	
	
	
	@Test
	public void CheckErrorMsg() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("loginButton")).click();
		WebElement errormsg=driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid')]"));
		String actual=errormsg.getText();
		String expected="Username or Password is invalid. Please try again.";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual,expected);
		System.out.println("assertion completed");
		sa.assertAll();
		driver.close();
		
	}

}
//assertion completed
//PASSED: CheckErrorMsg
