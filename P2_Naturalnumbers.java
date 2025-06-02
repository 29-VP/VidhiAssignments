package Assignment_CoreJava;

public class P2_Naturalnumbers {
	public static void main (String[] args)
	{
		// Find natural number and it's sum.
		int num = 1;
		
		System.out.println("First 10 Natural Numbers Are:");
		while (num <= 10) 
		 {

			System.out.println(num);
			num++;	
	    }
    
		int num1 = 10;
		int i = 1;
		int sum=0;
		
		while ( i <= num1 )
		{
			sum = sum + i;
			i++;
		}
		System.out.print("Sum of First 10 Natural Number is : " + sum);
   }
		
  }

