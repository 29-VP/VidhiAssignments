package Assignment_CoreJava;
import java.util.Scanner;

public class P6_OddEven {

	public static void main( String[] args)
	{
		// odd even numbers
		
		System.out.print("Enter Number :");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
        if (num % 2 == 0)		
        {
        	System.out.println("Number is even");
        }
        else
        {
        	System.out.println("Number is odd");
        }
        
        }
	}

