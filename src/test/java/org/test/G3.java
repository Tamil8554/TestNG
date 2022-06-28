package org.test;

import org.testng.annotations.Test;

public class G3 {

	@Test (groups = "Test-3")
	private void tc111() {
		System.out.println("Test 111");
	}
	@Test (groups = "Test-2")
	private void tc222() {
		System.out.println("Test 222");
	}	
	@Test (groups = "Test-1")
	private void tc333() {
		System.out.println("Test 333");
	}

}
