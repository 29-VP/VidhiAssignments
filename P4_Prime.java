package Assignment_CoreJava;
import java.util.Scanner;

public class P4_Prime 
{
	public static void main( String[] args) 
	{
		// Check number is prime or not.
		
		System.out.println("Enter Number :");
		
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		Sc.close();
		int flag = 0;
	    if(n==0 || n==1)
	    {
	    	System.out.println(" Entered Number " +n+ " is not prime ");
	    }
	    else
	    {
	    	int mnum = n/2;
	    	int i;
	    	for(i=2;i<=mnum;i++)
	    	{
	    		if(n%i == 0)
	    		{
		    	System.out.println(" Entered Number " +n+ " is not prime ");
                  flag = 1;
                  break;
	    		}
                  
	    	}
	    	
	   }
	      if(flag==0)
	      {
		    	System.out.println(" Entered Number " +n+ " is prime number ");

	      }
	    
	  }

	}

