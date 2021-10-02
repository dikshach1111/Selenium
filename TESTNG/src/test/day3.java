package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Parameters({"URL","APIKey/username"})
	@Test
	public void webLogin_homeLoan(String urlname, String key) {
		 System.out.println("Selenium - Web Login. Home Loan");
		 System.out.println(urlname);
		 System.out.println(key);
	}
	
	@Test
	public void mobileLogin_homeLoan() {
		System.out.println("Appium - Mobile Login. Home Loan");
	}
	
	@Test(groups= {"Smoke"})
	public void loginAPI_homeLoan() {
		System.out.println("REST API - Login API. Home Loan");
	}

	@Test(dataProvider="getData")
	public void mobileLogin(String username, String password) {
		System.out.println("Mobile Login.");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("Before Test: ");
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		
		/* 1. username and password - good credit history
		 * 2. username and password - no credit history
		 * 3. fraudlent credit history
		 */
		 
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0] = "first_uername";
		data[0][1] = "password";
		
		//2nd set
		data[1][0] = "second_uername";
		data[1][1] = "second_password";
				
		//3rd set
		data[2][0] = "third_uername";
		data[2][1] = "third_password";
		return data;
		   
		
	}
	
}

