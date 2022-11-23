package automation.testScript;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;

@Listeners(automation.genericLib.ListenerImplementation.class)
public class CustomerCreation extends BaseClass {

	//change main method
	
	@Test
	public void createCustomer() throws IOException 
	{
		
		CommonUtility cu=new CommonUtility();
		int num=cu.getRandomNumber(10000);
		String expcustomername=du.getDataFromExcelsheet("Sheet1", 0, 0);
		expcustomername=expcustomername+num;
		
		//click on task
		driver.findElement(By.id("container_tasks")).click();
		//driver.findElement(By.id("container_task")).click(); //parameterization
		//add new+
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		//create New Customer
		driver.findElement(By.className("createNewCustomer")).click();
		//enter customer name
		driver.findElement(By.className("newNameField")).sendKeys(expcustomername);
		//customer description(By.xpath("//textarea[@placeholder='Enter Customer Description']"))
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("Student");
		//create
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"),expcustomername));
		String actualcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(actualcustomername);
	}
}


