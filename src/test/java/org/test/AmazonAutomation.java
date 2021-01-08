package org.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;

public class AmazonAutomation extends BaseClass {
	
	@BeforeClass
	public static void browser() {
		loadBrowser();
		maxWindow();
    }
	
	@Test
	public void url() throws InterruptedException, IOException {
		launchBrowser("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		LoginPojo lp = new LoginPojo();
		click(lp.getTxtLogIn());
		
		Login1Pojo lp1 = new Login1Pojo();
		fill(lp1.getTxtPhNo(), excelRead(1, 1));
		btnClick(lp1.getBtnContinue());
		fill(lp1.getTxtPassword(), excelRead(1, 2));
		btnClick(lp1.getBtnSignIn());
	//	fill(lp1.getTxtPass(), excelRead(1, 2));
	//	btnClick(lp1.getBtnSub());
		
		
		Page1Pojo p1 = new Page1Pojo();
		fill(p1.getTxtSearch(), excelRead(1, 0));
		btnClick(p1.getBtnSearch());
		
		Page2Pojo p2 = new Page2Pojo();
		btnClick(p2.getBtnProduct());
		
		Page3Pojo p3 = new Page3Pojo();
		btnClick(p3.getBtnProduct());
		btnClick(p3.getBtnProceed());

	}
	
	
	

}
