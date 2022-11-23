package com.section3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG_CompleteComparision_HardAssert {
	
	@Test
	public void checkAssert()
	{
		String actual="Google";
		String expected="google";
		Assert.assertEquals(actual, expected);
		System.out.println("assertion completed");
	}

}
//FAILED: checkAssert