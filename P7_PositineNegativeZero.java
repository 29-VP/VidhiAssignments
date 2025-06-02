package Assignment_CoreJava;
import java.util.Scanner;

public class P7_PositineNegativeZero
{
	//Find Positive , Negative and Zero 
	
	public static void main (String [] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		sc.close();
		
		if (num > 0 )
		{
			 System.out.println("Number is Positive");
		}
		else if (num < 0 )
		{
			 System.out.println("Number is Negative");

		}
		else
		{ 
			 System.out.println("Number is Zero");

		}
	}
		
}


