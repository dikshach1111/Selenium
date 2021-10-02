import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(1);
		//driver.switchTo().frame(null); //if id is given to iframe
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);
		
		
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement  target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source,target).build().perform();		
		driver.switchTo().defaultContent();//to perform actions other than frames need to switch back to main content
		
		
	}

}
