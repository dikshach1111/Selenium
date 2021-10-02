import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abcd");
		
		driver.findElement(By.xpath("//div[@id='theloginform']/form/input[2]")).sendKeys("demo123");
		
		driver.findElement(By.xpath("//input[contains(@name,'Login')]")).click();
		String s1 = driver.findElement(By.cssSelector("#error")).getText();
		System.out.println(s1);
	
	}

}
