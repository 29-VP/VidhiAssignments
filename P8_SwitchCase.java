package Assignment_CoreJava;
import java.util.Scanner;

public class P8_SwitchCase {
  public static void main (String [] args)
  {
	  // Switch case example
	  
	  System.out.println("1.English");
	  System.out.println("2.Hindi");
	  System.out.println("3.Gujarati");
	  System.out.print("Enter Your Language: ");
	  Scanner sc = new Scanner(System.in);
	  int choice = sc.nextInt();
	  
	  switch(choice)
	  {
	  case 1:
		      System.out.println("Selected Languge is English");
		      break;
		      
	  case 2:
		      System.out.println("Slected Language is Hindi");
		      break;
	  case 3:
		      System.out.println("Selected Language is Gujarati");
		      break;
		      
      default:
    	      System.out.println("Invalid Choice");
    	      
	   }
	  
	  
	  
	  
  }
  
  
}
