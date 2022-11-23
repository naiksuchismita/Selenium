package automation.testScript;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;

public class AlertPopup extends BaseClass {
	
	@Test
	public void alertPopup() throws IOException
	{
	
	driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings")).click(); //setting button
	driver.findElement(By.linkText("Types of Work")).click(); //types of work
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click(); //create type of work
	driver.findElement(By.name("name")).sendKeys(du.getDataFromExcelsheet("Sheet1", 1, 0)); //name
	driver.findElement(By.xpath("//td[@id='ButtonPane']/input[2]")).click(); //cancel button
	CommonUtility cu=new CommonUtility();
	String msg=cu.getAlertMsg(driver);
	System.out.println(msg); //Are you sure you want to cancel the Type of Work creation?
	cu.getAlertCancel(driver);
	}
	
	

}
