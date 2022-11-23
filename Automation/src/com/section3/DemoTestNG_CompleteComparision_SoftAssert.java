package com.section3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTestNG_CompleteComparision_SoftAssert {
	
	@Test
	public void checkAssert()
	{
		String actual="hello";
		String expected="Hello";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual,expected);
		System.out.println("assertion completed");
		sa.assertAll();
	}

}
//assertion completed
//FAILED: checkAssert
