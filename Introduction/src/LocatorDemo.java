
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		//by id
		driver.findElement(By.id("firstName")).sendKeys("Enter first name");
		driver.findElement(By.id("lastName")).sendKeys("Enter last name");
		
		//by class name
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("example789"); //throw error cz of space in className
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("testemail.selenium1234");
		
		
		//by name
		driver.findElement(By.name("Passwd")).sendKeys("test_selenium12");
		
		//by css selector
		driver.findElement(By.cssSelector("#confirm-passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("test_selenium123");
		
		//by link Text
		//driver.findElement(By.linkText("Help")).click();  //for anchor tags
		
		//driver.navigate().back();
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.cssSelector("#accountDetailsNext > div > button > div.VfPpkd-RLmnJb"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);

		String ele1 = driver.findElement(By.xpath("//*[@id=\'view_container\']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[2]/div[2]/span")).getText();
		System.out.println(ele1);
		
		driver.close();
		
		
		
		

	}

}
