package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG_DependsOnMethods {
	
	
		
		@Test(dependsOnMethods="signUp")
		public void signIn()
		{
			System.out.println("sign in that Application");
		}
		
		@Test
		public void signUp()
		{
			System.out.println("first perform sign up");
		}


}
