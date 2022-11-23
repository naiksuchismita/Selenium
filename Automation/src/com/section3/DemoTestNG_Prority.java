package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG_Prority {
	
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("User created");
	}
	
	
	@Test(priority=2)
	public void modifyUser()
	{
		System.out.println("modify user");
	}
	
	
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("User deleted");
	}
	

}
