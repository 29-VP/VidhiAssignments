package Driverconnection;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverconnection {
	public static WebDriver getConnection(String url) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vidhi Autmation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
