package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG {
	
	//case:1
	@Test
	public void createUser()
	{
		System.out.println("User created");
	}
	
	//case:2-without @Test
	
	//case:3
	@Test
	public void deleteUser()
	{
		System.out.println("User deleted");
	}
	
//	User created
//	User deleted
//	PASSED: deleteUser
//	PASSED: createUser
}
