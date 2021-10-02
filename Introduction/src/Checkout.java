import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver,5);

		// add multiple elements to cart
		String[] listOfItems = { "Brocolli", "Carrot", "Corn", "Strawberry" };
		int j = 0;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// Thread.sleep(2000);

		addItems(driver, listOfItems);

		driver.findElement(By.cssSelector("a[class='cart-icon']")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div/button")).click();
		// Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	
		

	}

	public static void addItems(WebDriver driver, String[] listOfItems) {

		int j = 0;

		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < items.size(); i++) {

			String[] name = items.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List itemsArray = Arrays.asList(listOfItems);

			if (itemsArray.contains(formattedName)) {
				// click on add to cart
				j++;
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// break; //cannot use break for array...else it will come out of loop

				if (j == listOfItems.length) {
					break;
				}
			}
		}

	}

}
