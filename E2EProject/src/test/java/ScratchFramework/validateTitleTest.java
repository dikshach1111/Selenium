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

public class validateTitleTest extends base {

	public WebDriver driver;
	
	Logger log = LogManager.getLogger(validateTitleTest.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initDriver();
		log.info("Driver is initialised");
		driver.navigate().to(prop.getProperty("url"));
		log.info("Hit URL");
		handlePopup hp = new handlePopup();
		hp.handlePopup(driver);
		log.info("Handle popUp");
		
	}
	
	
	@Test
	
	public void basePageNavigation() throws IOException, InterruptedException{
		
		IndexPage ip = new IndexPage(driver);
		//compare text from browser with actual test, if not match then script fail/error
		Assert.assertEquals(ip.getTitle().getText(), "Deals of the Day");
		//System.out.println(ip.getTitle().getText());
		log.info("Title validated successfully");
	        
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		log.info("Close driver");
	}
	
	
}
