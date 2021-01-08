package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1Pojo extends BaseClass {
	
	 public Page1Pojo() {
		PageFactory.initElements(driver, this);
	}
	 
	 @FindBy (id="twotabsearchtextbox")
	 private WebElement txtSearch;
	 
	 @FindBy (xpath="(//input[@class='nav-input'])[2]")
	 private WebElement btnSearch;

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

}
