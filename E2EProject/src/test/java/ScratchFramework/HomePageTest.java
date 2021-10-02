package ScratchFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObj.IndexPage;
import resources.base;
import resources.handlePopup;

public class HomePageTest extends base {

	public WebDriver driver;
	Logger log = LogManager.getLogger(HomePageTest.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initDriver();
		
	}
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String userName, String password, String text) throws IOException, InterruptedException{
		
		driver.navigate().to(prop.getProperty("url"));
		handlePopup hp = new handlePopup();
		hp.handlePopup(driver);
		
		IndexPage ip = new IndexPage(driver);
		ip.LogIn().click();
		ip.userName().sendKeys(userName);
		ip.password().sendKeys(password);
		ip.loginBtn().click();
		Thread.sleep(5000);
		ip.mobile().sendKeys("9567486355");
		log.info(text);
		log.info("User validated successfully");
		
		}
	
	@DataProvider
	public Object[][] getData() {
		//row => how many different data types test should run
		//so here 2(0 nd 1) rows i.e. for restricted and non-restricted
		//column => how many data u are sending per test for 2nd []
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "nonRestrictedUser@test.com";
		data[0][1] = "123456";
		data[0][2] = "nonRestrictedUser";
		
		data[1][0] = "RestrictedUser@test.com";
		data[1][1] = "78954";
		data[1][2] = "restrictedUser";
		
		return data;
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
