package com.saburati.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saburati.base.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//img[@alt='students']")
	private WebElement studenOption;
	
	@FindBy(xpath = "//span[text()=' Add a Student']")
	private WebElement addStudenOption;
	
	@FindBy(xpath = "//h2[text()='Students']")
	private WebElement studentPageVerify;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public StudentPage navigateToStudentPage() {
		studenOption.click();
		addStudenOption.click();
		
		if(studentPageVerify.isDisplayed()==true) {
			System.out.println("User is navigated to Student Page");
		}else {
			System.out.println("User is not navigated to Student Page");
		}
		
		return new StudentPage();
	}

}
