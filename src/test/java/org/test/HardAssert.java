package org.test;

import org.openqa.selenium.WebElement;
import org.raja.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pojo.LoginPojo;

public class HardAssert extends BaseClass {
	
	@Test
	private void tc() {
		LoginPojo l=new LoginPojo();
		WebElement email = l.getTxtEmail();
		fill(email, "Tamil@123");
		Assert.assertEquals(email.getAttribute("value"), "Tamil@123");
		
		WebElement pass = l.getTxtPass();
		fill(pass, "Tamil123");
		Assert.assertEquals(pass.getAttribute("value"), "Tamil123");
		
		l.getBtnLogin().click();
		System.out.println("Done");
			
		
	}
		@Test 
		private void tc1() {
			
			String url = currentUrl();	
			Assert.assertTrue(url.startsWith("Http"), "Check url");
			System.out.println(url);
			
			}
		@Test
		private void tc2() {

			String title = gettitle();
			Assert.assertEquals(title, "Facebook-log in or sign up");
			System.out.println(title);

		}
			
		@BeforeMethod
		private void befm() {
			dateandtime();	}
		@AfterMethod
		private void aftm() {
			dateandtime();	}
		
		@BeforeClass
		private void bef() {
			launchBrowser();
			launchUrl("https://www.facebook.com/");
			maximize();
		}
		

}
