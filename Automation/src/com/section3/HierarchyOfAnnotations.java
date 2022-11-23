package com.section3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HierarchyOfAnnotations {
	
	@BeforeSuite
	public void openServer()
	{
		System.out.println("open server connection");
	}
	@BeforeTest
	public void openDB()
	{
		System.out.println("open DB connection");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch the browser");
	}
	@BeforeMethod
	public void loginAppln()
	{
		System.out.println("login the application");
	}
	@Test
	public void customerCreation()
	{
		System.out.println("customer created");
	}
	
	//case2: if one more test case will be there i.e.2 @Test
	
	@Test
	public void modifyCustomer()
	{
		System.out.println("customer modified");
	}
	
	@AfterMethod
	public void logoutAppln()
	{
		System.out.println("logout from the application");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close the browser");
	}
	@AfterTest
	public void closeDB()
	{
		System.out.println("close the DB");
	}
	@AfterSuite
	public void closeServer()
	{
		System.out.println("close the server");
	}

}
