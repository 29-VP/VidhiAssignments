package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Driverconnection.Driverconnection;

public class Prog8 {
	public static void main(String[] args) {
		
		String url = "https://demoqa.com/text-box";
		WebDriver driver= Driverconnection.getConnection(url);
		
		WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");
        
     
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        
      
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
       
        currentAddress.sendKeys(Keys.CONTROL);
        currentAddress.sendKeys("A");
        currentAddress.sendKeys(Keys.CONTROL);
        currentAddress.sendKeys("C");
        
    
        currentAddress.sendKeys(Keys.TAB);
       
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(Keys.CONTROL);
        permanentAddress.sendKeys("V");
        
       
        //assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
        
        driver.close();
		
	}
}
