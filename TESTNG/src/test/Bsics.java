package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Bsics {


@Test
public void Demo() {
	System.out.println("program without main method");
}

@AfterTest
public void lastexecute() {
	System.out.println("After test :will execute at end...");
	}

@AfterSuite
public void aftsuite() {
	System.out.println("After suite:");
}
}
