package CoreJavaExam;

import java.util.Scanner;

//if qty is 4 or more than 4 then only offer applied otherwise not.

class pizza
{
	public int get(int q,int o)
	{
		return q*o;
		
	}
	public void getq()
	{
		 
	}
}

public class Task {
	public static void main(String [] args)
	{
		pizza p =new pizza ();
		
		  System.out.println("small - Price 150- Offer on more than 3 Qty");
		  System.out.println("meduim - Price 250 - Offer on more than 2 Qty");
		  System.out.println("large - Price 500 - Offer on more than 1 Qty");
		  System.out.println("monster - Price 600 -  Offer on more than 1 Qty");
		  System.out.print("Enter Your Pizza Size: ");
		  Scanner sc = new Scanner(System.in);
		  Scanner sc1= new Scanner(System.in);
			
		  String choice = sc.nextLine();
		 
		  
		  int m;
		  int offer = 100;
	
		  switch(choice)
		  {
		  case "small":
			     System.out.print("Enter Your Qty:");
			     int qty = sc1.nextInt();
			     int price=150; 
			     m=price*qty;
			     System.out.println("Selected Size is small and "+"Final Price is: "+m);
			     if(qty>=4)
			     { 
			    	  int t =p.get(qty, offer);
			    	 System.out.println("Offer and Final Amount is : " + t);
			    	
			     }
			     else
			     {
			    	 System.out.println("Sorry No Offer Apply");
			     }
			     

			     break;
			      
		  case "meduim":
				  System.out.print("Enter Your Qty:");
				  int qty1 = sc1.nextInt();
			      int price1=250;
				  m=price1*qty1;
				  System.out.println("Selected Size is meduim and "+"Final Price is: "+m);
				  if(qty1>=3)
				     { 
				    	  int t =p.get(qty1, offer);
				    	 System.out.println("Offer - 500 ml coke free and Final Amount is : " + t);
				    	
				     }
				     else
				     {
				    	 System.out.println("Sorry No Offer Apply");
				     }
				     
			      break;
			      
		  case "large":
			     System.out.print("Enter Your Qty:");
				  int qty2 = sc1.nextInt();
				  int price2=500;
				  m=price2*qty2;
				  System.out.println("Selected Size is large and "+"Final Price is: "+m);

				  if(qty2>=2)
				     { 
				    	  int t =p.get(qty2, offer);
				    	 System.out.println("Offer - 500 ml coke free and Final Amount is : " + t);
				    	
				     }
				     else
				     {
				    	 System.out.println("Sorry No Offer Apply");
				     }
				     
			      break;
			      
		  case "monster":
			     System.out.print("Enter Your Qty:");
			     int qty3 = sc1.nextInt();
			     int price3=600;
			     m=price3*qty3;
			     System.out.println("Selected Size is monster and "+"Final Price is: "+m);
			     m=price3*qty3;
			     if(qty3>=1)
			     { 
			    	  int t =p.get(qty3, offer);
			    	 System.out.println("Offer - 500 ml coke free and Final Amount is : " + t);
			    	
			     }
			     else
			     {
			    	 System.out.println("Sorry No Offer Apply");
			     }
			     
		        break;
		      
	      default:
	    	      System.out.println("Invalid Choice");
	    	      
		   }
		  
		  
		  
		  
	 }
}
	
	
	
	
	
	

