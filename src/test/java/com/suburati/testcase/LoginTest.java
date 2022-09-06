package com.suburati.testcase;

import org.testng.annotations.Test;

import com.saburati.base.BrowserFactory;
import com.saburati.pages.LoginPage;
import com.saburati.utilities.PropertyUtility;

public class LoginTest extends BrowserFactory{
	
	@Test
	public void loginFunctionVerification() {
		
		LoginPage login = new LoginPage();
		login.loginApplication(PropertyUtility.getProperty("email"), PropertyUtility.getProperty("password"));
		
	}

}
