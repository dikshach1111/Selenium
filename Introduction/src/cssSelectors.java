import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("[class='fl small']")).click();
		driver.findElement(By.cssSelector("#un")).sendKeys("abcd");
		driver.findElement(By.cssSelector(".button.primary.fiftyfifty.right.focus")).click();
		

	}
}
