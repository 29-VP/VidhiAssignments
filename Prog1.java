package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Driverconnection.Driverconnection;

public class Prog1 {
	public static void main(String[] args) {
		String url = "https://demoqa.com/links";
		WebDriver driver= Driverconnection.getConnection(url);
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Home"));
		
		System.out.println(links.size());
			
		for(WebElement l:links) {
			System.out.println(l.getText());
		}
		links.get(1).click();
		
		driver.navigate().back();
		
		driver.close();
	}
		
		
}
