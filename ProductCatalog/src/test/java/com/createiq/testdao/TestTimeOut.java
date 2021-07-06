package com.createiq.testdao;

import org.junit.Rule;
import org.junit.Test;

public class TestTimeOut {
	
	@Test(timeout = 100)
	public void testTime() {
		System.out.println("These method must complete within 100 seconds");
	}
	
	

}
