package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"Smoke"})
	public void webLogin_carLoan() {
		 System.out.println("Selenium - Web Login");
	}
	
	
	@BeforeMethod
	public void befrEvery() {
		System.out.println("Before Method: will execute before every method in day 2 class");
	}
	
	@BeforeClass
	public void befrClass() {
		System.out.println("Before class: will execute before every method in class");
	}
	
	@AfterMethod
	public void aftEvery() {
		System.out.println("After Method: will execute after every method in day 2 class");
	}
	
	@Test(timeOut=4000)
	public void mobileLogin_carLoan() {
		System.out.println("Appium - Mobbile Login");
	}
	
	@Test(dependsOnMethods= {"mobileLogin_carLoan"})
	public void loginAPI_carLoan() {
		System.out.println("REST API - Login API");
	}

	@BeforeSuite
	public void bfsuite(){
		System.out.println("Before suite: ");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Before class: will execute before every method in class");
	}
}
