package org.test;

import org.raja.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pojo.LoginPojo;

public class Day2 extends BaseClass {
   @Test (priority = 0)
   private void tc3() {
	   LoginPojo l=new LoginPojo();
	   fill(l.getTxtEmail(), "Tamil");
	   fill(l.getTxtPass(), "Tamil@123");
	   l.getBtnLogin().click();  }
	@Test (priority = 2)
	private void tc1() {
		gettitle();	}
	@Test(enabled = false)
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
		launchUrl("https://www.facebook.com/");
		maximize();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
