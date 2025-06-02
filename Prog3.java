package Assignment;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Driverconnection.Driverconnection;


public class Prog3 {
	
	String url = "https://automationpanda.com/";
	WebDriver driver= Driverconnection.getConnection(url);
	
	public void multiwindows () throws InterruptedException
	{
		WebElement link = driver.findElement(By.linkText("Teaching"));
		link.click();
       
		Thread.sleep(2000);
		
		String mainWin = driver.getWindowHandle();
		
		Set<String> allWind= driver.getWindowHandles();
		
		for(String s:allWind) {
			if(!s.equals(mainWin)) {
				driver.switchTo().window(s);
				
				driver.findElement(By.name("emailid")).sendKeys("selenium@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"subscribe-submit\"]/button")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.quit();
		
	}
	
	public static void main(String[] args) throws InterruptedException
	 {
		 
		Prog3 p = new Prog3();
		p.multiwindows();
		
		
     }
}