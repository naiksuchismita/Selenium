package automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators {
	
	//constructor
	public LoginLocators(WebDriver driver)  //driver will help to get/search the value
	{
		PageFactory.initElements(driver, this); //whenever we are writing @findBy it will invoke this initelement method,
												//initelement method //in this,value will be updated
	}
	
	
	@FindBy(id="username")
	private WebElement usernameTB;
	
	@FindBy(name="pwd")
	private WebElement passwordTB;
	
	@FindBy(id="loginButton")
	private WebElement loginButtonTB;
	
	public WebElement getusernameTB()
	{
		return usernameTB;
	}
	
	public WebElement getpasswordTB()
	{
		return passwordTB;
	}
	
	public WebElement getloginButtonTB()
	{
		return loginButtonTB;
		
	}
	
	public void loginApp(String username,String password)
	{
		getusernameTB().sendKeys(username);
		getpasswordTB().sendKeys(password);
		getloginButtonTB().click();
	}

}
