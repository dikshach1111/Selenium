package resources;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class handlePopup {
	
	//public WebDriver driver;
	public void handlePopup(WebDriver driver) {
		
		Actions actions = new Actions(driver);
		Action action = actions.sendKeys(Keys.ESCAPE).build();
		action.perform();
	}

}
