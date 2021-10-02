package selenium4;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokeMultipleTabs_Windows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users/D885319/Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();

		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();
		driver.switchTo().window(parentWindow);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(courseName);
		File screenshot = name.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshot, new File("webelement_screenshot.png"));// to view screenshot->go to selenium4
																				// folder right
																				// click->refresh->screenshot is added

		System.out.println("Height:"+name.getRect().getDimension().getHeight());
		 System.out.println("Width:"+name.getRect().getDimension().getWidth());
		 
		 
	}

}
