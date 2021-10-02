package objRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {

	public SignUp(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	WebDriver driver;
		
	
     By customDomain = By.id("mydomain"); 
	 /*@FindBy(id="mydomain")
	 WebElement customDomain;*/
	 
	By contBtn = By.name("Continue");
	By backBtn = By.id("hint_back_domain");
	
	public WebElement customDomain() {
		return driver.findElement(customDomain);
		//return customDomain;
	}
	
	public WebElement contBtn() {
		return driver.findElement(contBtn);
	}
	
	public WebElement backBtn() {
		return driver.findElement(backBtn);
	}
}
