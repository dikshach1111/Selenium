package objRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	

	WebDriver driver;
	By userName = By.id("username");
	By password = By.xpath("//input[@id='password']");
	By loginBtn = By.name("Login");
	//By tryForFreeBtn = By.id("signup_link");
	By custDomain = By.id("mydomainLink");
	
	public WebElement emailId() {
		return driver.findElement(userName);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement logIn() {
		return driver.findElement(loginBtn);
	}
	
	public WebElement custDomain() {
		return driver.findElement(custDomain);
	}
}
