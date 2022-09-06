package com.saburati.base;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.saburati.utilities.PropertyUtility;

public class BrowserFactory extends BaseClass {
	
	@BeforeClass
	public void launchApplication() {
		setup(PropertyUtility.getProperty("browser"), PropertyUtility.getProperty("url"));
	}
	
	@AfterClass
	public void closeApplication() {
		teardown();
	}

}
