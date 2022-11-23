package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG_InvocationCount_0 {
	

	@Test(invocationCount=0)
	public void createUser()
	{
		System.out.println("User created");
	}

}
