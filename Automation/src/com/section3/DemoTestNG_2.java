package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG_2 {
	
	@Test
	public void createUser()
	{
		System.out.println("User created");
	}
	
	//case:4
	@Test
	public void modifyUser()
	{
		System.out.println("modify user");
	}
	
	
	@Test
	public void deleteUser()
	{
		System.out.println("User deleted");
	}
	
//	User created
//	User deleted
//  modify user

}
