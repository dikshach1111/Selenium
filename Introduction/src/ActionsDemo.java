import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_EAIaIQobChMIhsWY94T08gIVVx0rCh0BKQIVEAAYASAAEgKy6fD_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMIhsWY94T08gIVVx0rCh0BKQIVEAAYASAAEgKy6fD_BwE");
		 
		
		Actions a = new Actions(driver);
		WebElement mouseHover = driver.findElement(By.id("nav-link-accountList"));
		WebElement insertCapitalLetters = driver.findElement(By.id("twotabsearchtextbox"));
		
		//enter data in search box in Cptial letters
		a.moveToElement(insertCapitalLetters).click().keyDown(Keys.SHIFT).sendKeys("iphone").doubleClick().build().perform();	
	
		//mouse hover
		a.moveToElement(mouseHover).build().perform();

	}

}
