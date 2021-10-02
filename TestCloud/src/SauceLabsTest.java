import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(capabilityName, value);
		
		WebDriver driver = new RemoteWebDriver(new URL(),capabilities);
		driver.get("https://flipkart.com");
		System.out.println(driver.getTitle());
	}

}
