package Assignment_CoreJava;
import java.util.*;

public class P13_Max_Min_Sum_Avg_ofArray {
    public static void main(String[] args)
    {
    	
    	int []a= {500,600,20,30,40,10,80,5,100,300,6};
    	int sum=0;
    	int avg =0;
    	Arrays.sort(a);
    	
    	for(int j:a)
    	{
    	System.out.print(" "+ j + " ");	
    	}
    	
    	System.out.println("Length of Array is : "+ a.length);
    	System.out.println("min-"+a[0]+" 1st max-"+a[a.length-1]+" 2nd max-"+a[a.length-2]);
    	
    	for(int i=0;i<a.length;i++)
    	{
    		sum=sum+a[i];
    		
    	}
    	avg=sum/a.length;
    	System.out.println("Sum of Array is:" + sum);
    	System.out.println("Average of Sum of Array is :"+ avg);
    	
    		
    }
}
