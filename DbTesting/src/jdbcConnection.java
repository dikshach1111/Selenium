import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcConnection {
	
	public static void main(String[] args) throws SQLException {
		
		String host = "localhost";
		String port="3306";
		
		//String url = "jdbc:mysql://"+host+":"+port+"/qadb";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadb", "root", "root");
		
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from credentials where scenario='ZeroBalanceCard'");
		
		while(rs.next()) {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			
			driver.findElement(By.id("username")).sendKeys(rs.getString("userName"));
			
			driver.findElement(By.id("password")).sendKeys(rs.getString("password"));
		}
	}

}
