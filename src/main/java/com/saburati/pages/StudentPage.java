package com.saburati.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saburati.base.BaseClass;

public class StudentPage extends BaseClass{
	
	@FindBy(xpath = "//input[@formcontrolname='firstName']")
	private WebElement studentFirstNameEnglish;
	
	@FindBy(xpath = "//input[@formcontrolname='lastName']")
	private WebElement studentLastNameEnglish;
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	private WebElement studentEmail;
	
	@FindBy(xpath = "//input[@formcontrolname='studentId']")
	private WebElement studentId;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='class']")
	private WebElement studentClassDrop;
	
	@FindBy(xpath = "//span[text()='Class 11']")
	private WebElement selectStudentClass;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;
	
	public StudentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void studentFirstName(String firstName) {
		studentFirstNameEnglish.sendKeys(firstName);
	}
	
	public void studentLastName(String lastName) {
		studentLastNameEnglish.sendKeys(lastName);
	}
	
	public void studentEmailID(String email) {
		studentEmail.sendKeys(email);
	}
	
	public void studentID(String ID) {
		studentId.sendKeys(ID);
	}
	
	public void studentClass() {
		studentClassDrop.click();
		selectStudentClass.click();
	}
	
	public void saveButtonIcon() {
		saveButton.click();
	}

}
