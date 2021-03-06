package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import objRepo.FreeSignup;
import objRepo.HomePage;
import objRepo.SignUp;

public class LoginApplication {
	
	@Test
	public void Login()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\D885319\\Desktop\\diksha\\udemy\\Selenium\\PageObj\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		HomePage hp = new HomePage(driver);
		
		hp.emailId().sendKeys("abc@example.com");
		hp.password().sendKeys("123");
		hp.logIn().click();
		hp.custDomain().click();
		
		SignUp su = new SignUp(driver);
		su.customDomain().sendKeys("https://google.com");
		su.contBtn().click();
		su.backBtn().click();
		
		FreeSignup fs = new FreeSignup(driver);
		fs.signUpLink().click();
		//fs.firstName().sendKeys("ABCD");
		
		
	}

}
