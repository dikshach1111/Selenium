import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\D885319\\Desktop\\diksha\\udemy\\Selenium\\HandlePopup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//http://Username:Password@SiteURL
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();
	}

}
