package selenium4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		//to get path of properties file->right click on that file->properties
		FileInputStream fis = new FileInputStream("C:\\Users\\D885319\\Desktop\\diksha\\udemy\\Selenium\\selenium4\\src\\data.properties");
		prop.load(fis);
		System.out.println("Browser:" +prop.getProperty("browser"));
		System.out.println("URL:" +prop.getProperty("url"));
		prop.setProperty("browser", "IE");  //change value at runTime
		System.out.println("Browser:" +prop.getProperty("browser"));
		
		//to write back into file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\D885319\\Desktop\\diksha\\udemy\\Selenium\\selenium4\\src\\data.properties");
		prop.store(fos, null);
	}

}
