package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Driverconnection.Driverconnection;

public class Prog5 {
	
	public static void main(String[] args) {
		
	String url = "https://demoqa.com/radio-button";
	WebDriver driver= Driverconnection.getConnection(url);
	WebElement radioEle = driver.findElement(By.id("yesRadio"));
	boolean select = radioEle.isSelected();
	System.out.print(select);
	// performing click operation if element is not already selected
	if (select == false) {
		radioEle.click();
	}

	/**
	 * Find radio button using Xpath, Validate isDisplayed and click to select
	 */
	WebElement radioElem = driver.findElement(By.xpath("//div/input[@id='impressiveRadio']"));
	boolean sel = radioEle.isDisplayed();

	// performing click operation if element is displayed
	if (sel == true) {
		radioElem.click();
	}

	/**
	 * Find radio button using CSS Selector, Validate isEnabled and click to select
	 */
	WebElement radioNo = driver.findElement(By.cssSelector("input[id='noRadio']"));
	boolean selectNo = radioEle.isDisplayed();

	// performing click operation if element is enabled
	if (selectNo == true) {
		radioNo.click();
	}

}

}
	
	

