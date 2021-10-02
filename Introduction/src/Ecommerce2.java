import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce2 {
public static void main(String[] args) throws InterruptedException {
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
String[] itemNeeded = { "Cucumber", "Beetroot", "Brocolli" };
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
addItems(driver, itemNeeded); // First Method
/*

* Ecommerce2 ecomm=new Ecommerce2(); ecomm.addItems(driver, itemNeeded);

*/ // Second Method - No need to change the method as static
}
public static void addItems(WebDriver driver, String[] itemNeeded) {
int j = 0;
int q = 1;
List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
for (int i = 0; i < products.size(); i++) {
String[] name = products.get(i).getText().split("-");
String formattedName = name[0].trim();
List itemNeededList = Arrays.asList(itemNeeded);
if (itemNeededList.contains(formattedName)) {
j++;
for (int q1 = 0; q1 < 3; q1++)
{
driver.findElements(By.cssSelector("a.increment")).get(i).click();
}
driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
if (j == itemNeeded.length)
break;
}
}
}
}
