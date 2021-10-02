import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable_javaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		/* 1. click on veg/fruit column 
		 * 2. grab all web elements into list
		 * 3. for each element grab text =>original list
		 * 4. sort above elements => sorted list
		 */
		
		driver.findElement(By.cssSelector("table[class='table table-bordered'] thead tr th[aria-label*='Veg/fruit']")).click();
		
		List <WebElement> ele = driver.findElements(By.xpath("//tr//td[1]"));
		
		List<String> originalList = ele.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		
		//scan the name column with getText -> when encounter rice  ->print price of rice
		
		
		/* search for carrot...if its not present in 1st list go click on next
		 * search for carrot in current list
		 * if element is not found in 1st list..price will be less than 1...if element found price will be >1
		 * so we need to search in each page and get price...so will use do while loop
		 */
		
		List<String> price;
		
		do
		{
			
		List<WebElement> rows  = driver.findElements(By.xpath("//tr//td[1]"));
		
		 price =  rows.stream().filter(s->s.getText().contains("Cheese")).map(s->getPrice(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1) {
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);
	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String value = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return value;
	}

}
