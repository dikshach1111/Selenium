import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class testCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

		Assert.assertFalse(driver.findElement(By.cssSelector(".VfPpkd-muHVFf-bMcfAe")).isSelected());

		// driver.findElement(By.cssSelector(".VfPpkd-muHVFf-bMcfAe")).isSelected();

		driver.findElement(By.cssSelector(".VfPpkd-muHVFf-bMcfAe")).click();

		// System.out.println(driver.findElement(By.cssSelector(".VfPpkd-muHVFf-bMcfAe")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector(".VfPpkd-muHVFf-bMcfAe")).isSelected());

		Thread.sleep(2000);

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// count no of checkboxes
		// List<WebElement> count =
		// driver.findElements(By.xpath("//input[@type='checkbox']"));
		// System.out.println(count.size());

		Assert.assertEquals(6, 6);
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("travelOptions")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) // pass 0.5/1 to test
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		// driver.findElement(By.id("ctl00_mainContent_view_date2")).click();

	}

}
