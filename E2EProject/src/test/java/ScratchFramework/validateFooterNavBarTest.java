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
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObj.IndexPage;
import resources.base;
import resources.handlePopup;

public class validateFooterNavBarTest extends base {
	public WebDriver driver;
	Logger log = LogManager.getLogger(validateFooterNavBarTest.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
        
		driver = initDriver();
		
		driver.navigate().to(prop.getProperty("url"));
		handlePopup hp = new handlePopup();
		hp.handlePopup(driver);
	}
	
	
	@Test
	
	public void basePageNavigation() throws IOException, InterruptedException{
		
		
		IndexPage ip = new IndexPage(driver);
		
	    Assert.assertTrue(ip.footerNavBar().isDisplayed());      
	    Assert.assertTrue(ip.footer().isDisplayed());
	    
	    log.info("Footer validated successfully");
	    
		}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
}
