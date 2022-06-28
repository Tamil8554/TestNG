package org.test;

import org.testng.annotations.Test;

public class G2 {

	@Test (groups = "Test-2")
	private void tc1() {
		System.out.println("Test 1");
	}
	@Test (groups = "Test-1")
	private void tc2() {
		System.out.println("Test 2");
	}	
	@Test (groups = "Test-3")
	private void tc3() {
		System.out.println("Test 3");
	}
	
	
}
