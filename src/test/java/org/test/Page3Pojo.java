package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3Pojo extends BaseClass {
	
	public Page3Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="add-to-cart-button")
	private WebElement btnProduct;
	
	@FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
	private WebElement btnProceed;

	public WebElement getBtnProceed() {
		return btnProceed;
	}

	public WebElement getBtnProduct() {
		return btnProduct;
	}

}
