package selenium4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.openqa.selenium.support.locators.RelativeLocator.*;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class relativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users/D885319/Downloads//chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement editBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(withTagName("label").above(editBox)).getText());

		
	}

}
