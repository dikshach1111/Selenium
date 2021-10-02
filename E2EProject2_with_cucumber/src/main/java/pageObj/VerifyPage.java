package pageObj;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VerifyPage {

	public VerifyPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	

	WebDriver driver;
	
	By cont_btn = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']//span");
	
	public WebElement continue_btn() {
		return driver.findElement(cont_btn);
	}
	
}
