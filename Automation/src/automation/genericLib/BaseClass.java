package automation.genericLib;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import automation.elementRepository.LoginLocators;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver Listenerdriver;
	public DataUtility du=new DataUtility();
	
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		Listenerdriver=driver;
		
//	@Parameters("browser")
//	@BeforeClass(alwaysRun=true)
//	public void launchBrowser(String browser)
//	{
//		if(browser.equals("chrome"))
//		{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\suchi\\Documents\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		}
//		else if(browser.equals("edge"))
//		{
//			System.setProperty("webdriver.edge.driver", "C:\\Users\\suchi\\Documents\\edgedriver_win64\\msedgedriver.exe");
//			driver=new EdgeDriver();
//		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	//@Parameters({"username","password"})
	@BeforeMethod(alwaysRun=true)
	//public void login(String username,String password) throws IOException
	
	public void login() throws IOException
	{
		driver.get(du.getDataFromProperties("Url"));
		//driver.findElement(By.id("username")).sendKeys(username); //parameterization
		//driver.findElement(By.name("pwd")).sendKeys(password);
		
//		driver.findElement(By.id("username")).sendKeys(du.getDataFromProperties("Username"));
//		driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("Password"));
//		driver.findElement(By.id("loginButton")).click();
		
		LoginLocators ll=new LoginLocators(driver); //POM
		ll.loginApp(du.getDataFromProperties("Username"),du.getDataFromProperties("Password"));
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		driver.findElement(By.id("logoutLink"));
	}
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}

}
