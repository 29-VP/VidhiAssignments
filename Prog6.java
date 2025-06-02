package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Driverconnection.Driverconnection;

public class Prog6 {

	public static void main(String[] args) {
		
		String url = "https://geeksforgeeks.org";
		WebDriver driver= Driverconnection.getConnection(url);
		
		 // Locate the image using its XPath
        WebElement image = driver.findElement(By.xpath(
            "//img[@src='https://media.geeksforgeeks.org/gfg-gg-logo.svg']"));

        // Check if the image is displayed
        if (image.isDisplayed()) {
            System.out.println("Logo present");
        }
        else {
            System.out.println("Logo NOT present");
        }
    }
				
}

