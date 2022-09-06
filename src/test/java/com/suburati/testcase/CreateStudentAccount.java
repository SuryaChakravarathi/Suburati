package com.suburati.testcase;

import org.testng.annotations.Test;

import com.saburati.base.BrowserFactory;
import com.saburati.pages.HomePage;
import com.saburati.pages.LoginPage;
import com.saburati.pages.StudentPage;
import com.saburati.utilities.PropertyUtility;

public class CreateStudentAccount extends BrowserFactory{
	
	@Test
	public void verifyCreateStudentFunction() {
		
		LoginPage login = new LoginPage();
		HomePage home = login.loginApplication(PropertyUtility.getProperty("email"), 
										PropertyUtility.getProperty("password"));
		
		StudentPage student = home.navigateToStudentPage();
		
		student.studentFirstName(PropertyUtility.getProperty("firstname"));
		student.studentLastName(PropertyUtility.getProperty("lastname"));
		student.studentEmailID(PropertyUtility.getProperty("studentemail"));
		student.studentID(PropertyUtility.getProperty("studentid"));
		student.studentClass();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
