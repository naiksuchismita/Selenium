package com.section3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import automation.genericLib.BaseClass;

public class Validation extends BaseClass {
	
	@Test
	public void actiTime() throws IOException {
		logout();
		WebElement we=driver.findElement(By.id("loginButton"));
		we.click();
		WebElement we1=driver.findElement(By.xpath("//span[contains(text(),'Please try again')]"));
		String result=we1.getText();
		String input="Username or Password is invalid. Please try again.";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(result.contains(input));
		//sa.assertEquals(result,input);
		//Reporter.log("TC is pased",true);
		login();
		sa.assertAll();
		}

}
