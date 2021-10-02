import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle()); //get page Title
		System.out.println(driver.getCurrentUrl()); //to validate you are on correct URL
		
		//System.out.println(driver.getPageSource()); //some websites do not allow to view page src like banking so we can use this
		driver.get("https://spicejet.com");
		driver.navigate().back();
		
		driver.close(); //close current browser window
		//driver.quit(); //close all browsers window
		
	}

}
