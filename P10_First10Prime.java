package Assignment_CoreJava;

public class P10_First10Prime {
	public static void main(String[]args)
	{
	int num = 10;  
    int count;  
   
    
    for (int i = 1; i <= num; i++) {
      count = 0;  

     for (int j = 2; j <= i / 2; j++) 
      {
        if (i % j == 0) {
          count++; 
          break;  
        }
      }

      if (count == 0) {
        System.out.println(i); 
   
      }
    }
 }
}
