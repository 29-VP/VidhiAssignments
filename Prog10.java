package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Driverconnection.Driverconnection;

public class Prog10 {

public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.geeksforgeeks.org/";
		WebDriver driver= Driverconnection.getConnection(url);
		
		List<WebElement> links
        = driver.findElements(By.tagName("a"));

  
    for (WebElement link : links) {
        System.out.println(link.getText());
    }

    driver.close();
		
 }
}
