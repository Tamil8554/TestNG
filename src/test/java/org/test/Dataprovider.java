package org.test;

import org.raja.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import com.pojo.LoginPojo;

public class Dataprovider extends BaseClass {
   @Test(dataProvider = "data",dataProviderClass = G1.class)  
   private void tc3(String email, String pass) {
	   launchUrl("https://www.facebook.com/");
	   LoginPojo l=new LoginPojo();
	   fill(l.getTxtEmail(), email);
	   fill(l.getTxtPass(), pass);
	   l.getBtnLogin().click();  }
	@Test 
	private void tc1() {
		gettitle();	}
	@Test
	private void tc2() {
		currentUrl();	}	
	@BeforeMethod
	private void befm() {
		dateandtime();	}
	@AfterMethod
	private void aftm() {
		dateandtime();	}
	@AfterClass
	private void aftc() {
		close();	}
	@BeforeClass
	private void bef() {
		launchBrowser();
		maximize();
	}
	
				
	
	}
	
	
	
	
		
	
	
	

