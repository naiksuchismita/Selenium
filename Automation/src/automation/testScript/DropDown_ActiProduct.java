package automation.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;

public class DropDown_ActiProduct extends BaseClass {
	
	@Test
	public void selectDropDown()
	{
		driver.findElement(By.className("popup_menu_button_settings")).click(); //setting button
		driver.findElement(By.xpath("//div[contains(text(),'Manage system settings')]/..")).click(); //general setting
		WebElement topgroupinglevel=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));//customer dropdown
		CommonUtility cu=new CommonUtility();
		cu.getSelectByVisibleText(topgroupinglevel, "Product");
		//s.selectByVisibleText("Product");
		String msg=driver.findElement(By.id("FormModifiedTextCell")).getText();
		System.out.println(msg);  //MODIFICATIONS NOT SAVED
	}

}
