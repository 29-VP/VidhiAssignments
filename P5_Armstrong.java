package Assignment_CoreJava;
import java.util.Scanner;


public class P5_Armstrong 
{
	public static void main( String[] args)
	{
		// Check number is Armstrong or not.
		
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
	    int j = Integer.toString(num).length();
	    System.out.println("Number of Digit is " + j);
	
	    int sum = 0;
	    int temp;
	    temp = num;
	    
	    while (temp>0)
	    {
	      int ld = temp % 10;
	      sum = (int) (sum +  Math.pow(ld,j));
	      temp = temp/10;
	    }
	    
	    if( sum == num)
	    
	    {
	    	System.out.println("Entered Number " + num + " is Armstrong");
	    	
	    }
	    else
	    {
	    	System.out.println("Entered Number " + num + " is Not Armstrong");

	    }
	    
	    
	    }
	   
	}
	
	

