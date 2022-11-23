package com.section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_setting_typesOfWork_AlertPopUp_Cancel_Ss {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		
		
		driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings")).click(); //setting button
		driver.findElement(By.linkText("Types of Work")).click(); //types of work
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click(); //create type of work
		
		driver.findElement(By.name("name")).sendKeys("Suchi"); //name
		//WebElement dd=driver.findElement(By.name("active"));
		//dd.sendKeys(Keys.ARROW_DOWN);
		//dd.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//td[@id='ButtonPane']/input[2]")).click(); //cancel button
		Alert alt=driver.switchTo().alert();
		//fetch msg
		String msg=alt.getText();
		System.out.println(msg);
		//cancel popup
		alt.dismiss();
		//screenshot
		WebElement createss=driver.findElement(By.xpath("//td[contains(text(),'Create New Type')]"));
		File src=createss.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/createss.png");
		FileUtils.copyFile(src, trg);
		
		
	}

}
