import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//dynamic dropdown
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 
		 driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		 Thread.sleep(2000);
		 
		 //no need to click on "To" cz after selecting from it is dynamically opening
		 //driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		 
		 driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();//sometimes indexes are not approved by client/when we git pull
		 driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();//so instead we can use this one
		                                               
		 Thread.sleep(2000);
         driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();		 
		 
		 //driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]/a")).click();
		 
	}

}
