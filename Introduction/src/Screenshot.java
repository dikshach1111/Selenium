import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		SoftAssert s = new SoftAssert();
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot,new File("C:\\Users\\D885319//screenshot.png"));
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List <WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			
			HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int respCode = con.getResponseCode();
			System.out.println(respCode);
			
			s.assertTrue(respCode<400,"The "+link.getText()+" failed");
			
		}
		
		s.assertAll();
	}

	
	
}
