package com.saburati.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saburati.base.BaseClass;
import com.saburati.base.BrowserFactory;

public class LoginPage extends BaseClass{
	
	@FindBy(id = "email")
	private WebElement emailTextBox;
	
	@FindBy(id = "password")
	private WebElement passwordTextBox;
	
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	private WebElement signInButton;
	
	@FindBy(xpath = "//h2[text()='Dashboard']")
	private WebElement dashboardText;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginApplication(String email, String password) {
		emailTextBox.sendKeys(email);
		passwordTextBox.sendKeys(password);
		signInButton.click();
		
		boolean status = dashboardText.isDisplayed();
		if(status==true) {
			System.out.println("User has logged in the Application");
		}else {
			System.out.println("User cannot logged in the Application");
		}
		
		return new HomePage();
	}
	
}
