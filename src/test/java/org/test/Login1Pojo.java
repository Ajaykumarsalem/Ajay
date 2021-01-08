package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Pojo extends BaseClass {
	
	public Login1Pojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement txtPhNo;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy(id="ap_password")
	private WebElement txtPassword;
	
	@FindBy(id="signInSubmit")
	private WebElement btnSignIn;
	
	@FindBy(id="ap_password")
	private WebElement txtPass;
	
	@FindBy(id="signInSubmit")
	private WebElement btnSub;

	public WebElement getBtnSub() {
		return btnSub;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getTxtPhNo() {
		return txtPhNo;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}
	
}
