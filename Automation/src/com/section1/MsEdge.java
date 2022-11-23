package com.section1;

import org.openqa.selenium.edge.EdgeDriver;

public class MsEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Browser server confiration
		System.setProperty("webdriver.edge.driver","C:\\Users\\suchi\\Documents\\edgedriver_win64\\msedgedriver.exe");
		//Launch Edge Browser
		EdgeDriver driver=new EdgeDriver();
		//Open Edge Driver
		driver.get("https://www.amazon.com/");

	}

}
