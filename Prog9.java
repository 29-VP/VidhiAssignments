package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driverconnection.Driverconnection;

public class Prog9 {
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/alerts";
		WebDriver driver= Driverconnection.getConnection(url);
		 driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
	        Thread.sleep(3000);
	      
	        
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
	        Thread.sleep(3000);
	      
	        
	        Alert alert1 = driver.switchTo().alert();
	        alert1.dismiss();        
}
}
