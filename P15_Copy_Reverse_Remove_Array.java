package Assignment_CoreJava;

public class P15_Copy_Reverse_Remove_Array {
  public static void main(String[] args)
  {
	  
	
	  int [] a = {10, 20, 30, 40, 50};  
	  
      int [] b = new int[a.length];
      
      System.out.println("Original array A : ");  
      
      for (int i = 0; i < a.length; i++) 
      {  
          System.out.println(a[i] + " ");  
          b[i]=a[i];
      }  
      System.out.println("Copied array B : "); 
      for (int i = 0; i < b.length; i++) 
      {  
          System.out.print(b[i] + " ");  
          
      }  
      
      System.out.println();  
      
      System.out.println("Array in reverse order: ");  
      
      for (int j = a.length-1; j >= 0; j--) 
      {  
          System.out.print(a[j] + " ");  
      }  
      
      
      
      
  }
  
}
