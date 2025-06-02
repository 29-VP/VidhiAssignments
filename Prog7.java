package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Driverconnection.Driverconnection;

public class Prog7 {

public static void main(String[] args) {
		
		String url = "https://demoqa.com/select-menu";
		WebDriver driver= Driverconnection.getConnection(url);
		
		
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));

       
        List<WebElement> lst = select.getOptions();

    
        System.out.println("The dropdown options are:");
        for(WebElement options: lst)
            System.out.println(options.getText());


        System.out.println("Select the Option by Index 4");
        select.selectByIndex(4);
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        
        System.out.println("Select the Option by Text Magenta");
        select.selectByVisibleText("Magenta");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        
        System.out.println("Select the Option by value 6");
        select.selectByValue("6");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        driver.quit();
    }


		
 }

