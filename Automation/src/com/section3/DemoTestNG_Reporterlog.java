package com.section3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG_Reporterlog {
	
	@Test
	public void customerCreated()
	{
		System.out.println("customer created");
		Reporter.log("customer created successfully"); //execute only inside execution report
	}
	
	@Test
	public void modifyCustomer()
	{
		System.out.println("customer modified");
		Reporter.log("customer modified successfully",true); //execute in both execution report & console

	}

}
