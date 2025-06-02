package Assignment_CoreJava;

public class P9_Pyramids
{
   public static void main (String [] args)
   {
	   for(int i=1;i<=5;i++) {//row
			for(int j=1;j<=5;j++) {//column
				System.out.print("*");
			}
			System.out.println();
		}
	   System.out.println("==========================");

	   
	   for(int l=1;l<=5;l++)//row
	   {
	     for (int k=1; k<=l;k++)//column
	     {
		   System.out.print(k);
	     }
		   System.out.println();
	   }
	   System.out.println("==========================");

	   
	   
	   for (int f=1;f<=5;f++)//row 12345
	   {
	     for (int p=5;p>=f;p--)//column 54321
	      {
		    System.out.print(p);
	       }
	   System.out.println();
	   }
	   
	   System.out.println("==========================");
	   
	   
	   for (int a=1;a<=5;a++)
	   {
		   for(int b=4;b>=a;b--)
		   {
		    System.out.print(" ");
		   }
		   for (int c=1;c<=a;c++)
		   {
			  System.out.print(" *");
			   //System.out.print("*");
		   }
		   System.out.println();
	   }
	   System.out.println("==========================");
	   
	  
	       for (int e=5;e>=1;e--)
	      {
		    System.out.println("");
		     
		       for(int r=e;r<=5;r++)
		     {
		    	   
				    System.out.print(" * ");
				    
		     }
		 }
		   System.out.println();
		   
	System.out.println("==========================");
		      
	  for (int v=1;v<=5;v=v+2)
	   {
		   for(int x=4;x>=v;x--)
		   {
		    System.out.print(" ");
		   }
		   for (int t=1;t<=v;t++)
		   {
			  System.out.print(" *");
			   
		   }
		   System.out.println();
		   
       }
	
		  
		   
		   
	   }
  
		   }
	   
       
   

   
   
	   
	   
   
   

