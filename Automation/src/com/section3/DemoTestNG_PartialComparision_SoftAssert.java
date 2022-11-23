package com.section3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTestNG_PartialComparision_SoftAssert {
	
	@Test
	public void checkAssert()
	{
		String actual="hello";
		String expected="hell";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actual.contains(expected));
		System.out.println("assertion completed");
		sa.assertAll();
	}

}
//assertion completed
//PASSED: checkAssert
