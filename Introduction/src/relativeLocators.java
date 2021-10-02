import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class relativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement editBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(withTagName("label").above(editBox)).getText());
		
		WebElement checkBox = driver.findElement(By.className("form-check-label"));
	driver.findElement(withTagName("input").toLeftOf(checkBox)).click();

	}

}
