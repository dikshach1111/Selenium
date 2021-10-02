package objRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FreeSignup {

	public FreeSignup(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	WebDriver driver;
		
	
	By signupLink = By.id("signup_link");
	By firstName = By.name("UserFirstName");
	
	public WebElement signUpLink() {
		return driver.findElement(signupLink);
	}
	
	public WebElement firstName() {
		return driver.findElement(firstName);
	}
}
