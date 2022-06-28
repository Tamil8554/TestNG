package org.test;

import org.raja.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pojo.LoginPojo;

public class Paramater extends BaseClass {
	@Parameters({ "Username", "Password" })
	@Test
	private void tc1(String email, String pass) {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), email);
		fill(l.getTxtPass(), pass);
	}

	@Test
	private void tc2() {
		currentUrl();
	}

	@Test
	private void tc3() {
		gettitle();
	}

	@BeforeClass
	private void bef() {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		maximize();
	}

	@AfterClass
	private void aft() {
		close();
	}

	@BeforeMethod
	private void befm() {
		dateandtime();
	}

	@AfterMethod
	private void aftm() {
		dateandtime();
	}
}
