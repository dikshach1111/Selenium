import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\D885319\\Desktop\\diksha\\udemy\\Selenium\\HandlePopup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.findElement(By.xpath("//button[@class='l3tlg0-0 hrcxSS']//span[@class='sc-1rd62mt-2 ejRuwW']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\D885319\\Desktop\\diksha\\udemy\\Selenium\\fileUpload.exe");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".sc-2xfn8l-0.bxyVaO.sxq67w-0.sc-1c9rd1d-0.ccSOtz")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".sc-1mszb21-1.cuYLAk")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".r5zwp6-2.ghYfBB")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[name()='svg'] and @fill='#currentColor']")).click();
		//driver.findElement(By.cssSelector(".lqkt1b-0.fdItuc.l3tlg0-1.cTofYg")).click();
		//driver.close();
		
		//everytime any changes made in fileUpload compile and then run thistest case
		
	}

}
