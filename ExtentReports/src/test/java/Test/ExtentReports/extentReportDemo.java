package Test.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReportDemo {

	ExtentReports extent;
	
	@BeforeTest
	public void config() {
	
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Smith");
	}
	
	
@Test	
public void initialDemo() {
	
	ExtentTest test = extent.createTest("Initial demo");
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	System.out.println("Title:" +driver.getTitle());
	//extent.flush();
	driver.close();
	//test.fail("Results do not match");
	
	extent.flush();
}
	
	
}
