package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2Pojo extends BaseClass {
	
	public Page2Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Samsung Galaxy S20 FE 5G | Factory Unlocked Android Cell Phone | 128 GB | US Version Smartphone | Pro-Grade Camera, 30X Space Zoom, Night Mode | Cloud Mint Green']")
	private WebElement btnProduct;

	public WebElement getBtnProduct() {
		return btnProduct;
	}
	
	

}
