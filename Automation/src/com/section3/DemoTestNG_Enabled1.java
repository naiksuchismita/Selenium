package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG_Enabled1 {
	
	@Test
	public void createUser()
	{
		System.out.println("User created");
	}
	
	
	@Test(enabled=false)
	public void modifyUser()
	{
		System.out.println("modify user");
	}

}
