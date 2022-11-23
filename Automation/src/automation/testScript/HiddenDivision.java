package automation.testScript;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;


public class HiddenDivision extends BaseClass {
	
	@Test
	public void hiddenDivision() throws InterruptedException
	
	{
	driver.findElement(By.id("container_tasks")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='innerScrollableContainer']/table/tbody/tr/td")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='delete button']")).click();
	//Thread.sleep(2000);
	String del=driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
	System.out.println(del); 
	}

}
