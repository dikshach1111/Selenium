import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://qaclickacademy.com/");

		driver.findElement(By.xpath("//a[@href='https://www.rahulshettyacademy.com/AutomationPractice']")).click();

		// get count of all links in web page
		System.out.println("Links present on web page:" + driver.findElements(By.tagName("a")).size());

		// get count of all links present at footer
		WebElement footer = driver.findElement(By.id("gf-BIG"));

		System.out.println("links present at footer:" + footer.findElements(By.tagName("a")).size());

		// count of links of only 1st column
		WebElement firstColumn = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));

		System.out.println("links of only 1st column:" + firstColumn.findElements(By.tagName("a")).size());

		// click on each link in column and check if pages are opening and getText of
		// each tab

		for (int i = 1; i < firstColumn.findElements(By.tagName("a")).size(); i++) {

			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);

			Thread.sleep(5000L);
		}
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> itr = handle.iterator();

		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}

	}

}
