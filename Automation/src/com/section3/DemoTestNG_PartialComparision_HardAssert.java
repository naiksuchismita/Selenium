package com.section3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG_PartialComparision_HardAssert {
	
	@Test
	public void checkAssert()
	{
		String actual="hello";
		String expected="hell";
		Assert.assertTrue(actual.contains(expected));
		System.out.println("assertion completed");
	}

}
//assertion completed
//PASSED: checkAssert