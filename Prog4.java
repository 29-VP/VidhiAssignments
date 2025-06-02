package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Driverconnection.Driverconnection;

public class Prog4 {
	public static void main(String[] args) {
	
	String url = "https://mail.google.com/";
	WebDriver driver= Driverconnection.getConnection(url);
	

     // Create an instance of ChromeDriver
    
     
     
	 WebElement firstName = driver.findElement(By.id("firstName"));
     WebElement lastName = driver.findElement(By.id("lastName"));
     WebElement username = driver.findElement(By.id("username"));
     WebElement password = driver.findElement(By.name("Passwd"));
     WebElement confirmPassword = driver.findElement(By.name("ConfirmPasswd"));

     firstName.sendKeys("John");
     lastName.sendKeys("Doe");
     username.sendKeys("johndoe123");
     password.sendKeys("SecurePass123");
     confirmPassword.sendKeys("SecurePass123");

     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]")));
     nextButton.click();

     // Additional automation steps can be added here.

     driver.quit();
 
}

}
