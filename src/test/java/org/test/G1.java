package org.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class G1 {
	@Test(groups = "Test1")
	private void tc11() {
		System.out.println("Test 11");
	}

	@Test(groups = "Test2")
	private void tc22() {
		System.out.println("Test 22");
	}

	@Test(groups = "Test3")
	private void tc33() {
		System.out.println("Test 33");
	}

	@DataProvider(name = "data")
	private String[][] data() {
		   return new String[][] {
			{ "Tamil", "1234" }, 
			{ "Raja", "5678" },
			{ "Java", "123" },

		};

	}
}
