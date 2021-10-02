import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		// add multiple elements to cart
		String[] listOfItems = {"Brocolli", "Carrot", "Corn", "Strawberry"};
		int j=0;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(2000);
		// select element based on text displayed on FE
		// $x("//button[text()='ADD TO CART']")
		
		//if method is not declared as static then create obj..else
		//AddToCart atc = new AddToCart();
		//atc.addItems(driver,listOfItems);
		
		addItems(driver,listOfItems);

			}
	
	
	public static void addItems(WebDriver driver, String[] listOfItems)
	{
		
		int j=0;
		
	List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));

	for (int i = 0; i < items.size(); i++) {
		// System.out.println(items.get(i).getText());

		String[] name = items.get(i).getText().split("-");
		String formattedName = name[0].trim();
		
		//as we are providing only names of veggies in array...but it will retrieve with x-1kg so need to trim
		// check whether listOfItems you expected is present in arraylist or not
		//convert array into arraylist for best search results
		List itemsArray = Arrays.asList(listOfItems);

		// if(name.contains("Nuts Mixture - 1 Kg"))
		
		
		if (itemsArray.contains(formattedName)) {
			// click on add to cart
			j++;
			//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			// break; //cannot use break for array...else it will come out of loop

			if(j==listOfItems.length) {
				break;
			}
		}
	}

	}

}
