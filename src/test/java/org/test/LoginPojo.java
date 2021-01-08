package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {
	    PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	private WebElement txtLogIn;

	public WebElement getTxtLogIn() {
		return txtLogIn;
	}
	
	
	
}
