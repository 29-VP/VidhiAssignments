package Assignment_CoreJava;

public class P11_SumandAverageofArray {
	public static void main(String[]args)
	{
		/*String [] Cars = {"Hello","World"};
		System.out.println(Cars[0]);
		System.out.println(Cars[1]);
		Cars[0]="My";
		System.out.println(Cars[0]);
		System.out.println(Cars[1]);
		System.out.println(Cars.length);
		
		for(String i : Cars)
		{
			System.out.println(i);
		}
		
		for (int i=0;i<Cars.length;i++)
		{
			System.out.println(Cars[i]);

		}
		}
		
		//int [] numbers= {10,20,30,40,50};
		//System.out.println(numbers[0]);
*/
        int sum=0;
        int avg=0;
		int [] A1 = {10,20,30};
		for(int i=0;i<A1.length;i++)
		{
			sum=sum+A1[i];
			
		}
		
		System.out.println("Sum of Array is " + sum);
		avg=sum/A1.length;
		System.out.println("Avg of Array is " + avg);
	
	  }
	}


