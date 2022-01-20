package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainParent {
	public static WebDriver driver;
	public static Properties prop;
	
    public MainParent() {
	    try {
			prop = new Properties(); 
			FileInputStream fis = new FileInputStream("C:\\Users\\Owner\\eclipse-workspace\\InternshipJan2022BDDPOM\\src"
					+ "\\main\\java\\properties\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	public void initialization() {
		System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("QAtestURL"));
		
	}
	
	public void tearDown() {
		driver.close();
	}

}
