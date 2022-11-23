package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG_InvocationCount {
	
	@Test(invocationCount=5)
	public void createUser()
	{
		System.out.println("User created");
	}

}
