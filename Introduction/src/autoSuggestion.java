import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class autoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("selenium");
		
		Thread.sleep(2000);
		////ul[@class='erkvQe']/li/div/div[2]/div/span/b
		
	List<WebElement> options = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
	for(WebElement option : options) {
		if(option.getText().equalsIgnoreCase("selenium interview questions")) {
			option.click();
			break;
		}
		
		
	}

	}
}
