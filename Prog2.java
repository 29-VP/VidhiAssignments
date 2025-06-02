package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Driverconnection.Driverconnection;

public class Prog2 

{
	public static void main(String[] args) throws InterruptedException{
		
	
	
		  
	String url = "https://demoqa.com/selectable";
	WebDriver driver= Driverconnection.getConnection(url);
	

	WebElement data1 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]"));
	WebElement data2 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]"));
	
	Actions action=new Actions(driver); 
    Action seriesOfActions = (Action) action.keyDown(Keys.CONTROL) 
            .click(data1) 
            .click(data2) 
            .build(); 
    seriesOfActions.perform(); 
    Thread.sleep(3000); 
    driver.close();       
}
}