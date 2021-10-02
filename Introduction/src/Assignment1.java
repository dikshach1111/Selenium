import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println("Checked:"+driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println("Checked:"+driver.findElement(By.id("checkBoxOption1")).isSelected());

		System.out.println("Total number of checkboxes:"+driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		

	}

}
