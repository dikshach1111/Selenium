import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rahulShettyAcademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//dropdown with select tag
		WebElement staticDropdown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByVisibleText("USD");
		System.out.println("Selected by Visible Text:"+dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("INR");
		System.out.println("Selected by Value:"+dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByIndex(2);
		System.out.println("Selected by Index:"+dropdown.getFirstSelectedOption().getText());
	
        //driver.close();
        
        driver.get("https://beta.spicejet.com/");
        
        driver.findElement(By.xpath("//*[@data-testid='home-page-travellers']")).click();
        Thread.sleep(2000);
        
        for (int i=1;i<=3;i++)
        {
        driver.findElement(By.xpath("//*[@data-testid='Adult-testID-plus-one-cta']")).click();
        }
        
        System.out.println(driver.findElement(By.xpath("//*[@data-testid='home-page-travellers']/div[2]/div[1]")).getText());
        driver.findElement(By.xpath("//*[@data-testid='home-page-flight-cta']")).click();
       
	}

}
