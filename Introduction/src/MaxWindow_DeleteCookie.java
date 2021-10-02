import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxWindow_DeleteCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  //deletes all cookies
		//driver.manage().deleteCookieNamed("asdf");
		//driver.manage().getCookieNamed("");
		//driver.manage().getCookies();
		
		//session cookie delete
		
		driver.get("https://google.com");

	}

}
