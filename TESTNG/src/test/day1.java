package test;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day1 {

	@Test(enabled=false)
	public void Demo() {
		System.out.println("day 1");
	}
	
	@Test(groups= {"Smoke"})
	public void Demo2() {
		System.out.println("Demo2");
	}
	
	@Test
	public void testListener() {
	  System.out.println("***test Listener****");
	  Assert.assertTrue(false);
	}
}
