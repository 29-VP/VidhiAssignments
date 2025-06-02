package Assignment_CoreJava;
import java.util.Scanner;

public class P3_Factorial 
{
	public static void main( String[] args)
	{
		// Find Factorial for given number.

   System.out.println("Enter Number :");
    Scanner sc = new Scanner(System.in); 
    int num = sc.nextInt();
    sc.close();
    int i;
    int f=1;
    for(i=1;i<=num;i++)
     {
    	f=f*i;
     }
    System.out.println("Factorial of " +num+ " is : " +f);
   }
}
   
		
	



