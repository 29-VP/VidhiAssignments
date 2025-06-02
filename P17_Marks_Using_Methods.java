package Assignment_CoreJava;
import java.util.Scanner;

class Result
{
	public int Marks (int m)
	{
		
		if(m >=91 && m <=100)
		{
			System.out.println("Grade AA");
		}
			
	    else if(m >=81 && m<=90)
		{ 
				System.out.println("Grade AB");
		}
	    else if(m >=71 && m<=80)
		{ 
				System.out.println("Grade BB");
		}
	    else if(m >=61 && m<=70)
		{ 
				System.out.println("Grade BC");
		}
	    else if(m >=51 && m<=60)
		{ 
				System.out.println("Grade CD");
		}
	    else if(m >=41 && m<=50)
		{ 
				System.out.println("Grade DD");
		}
	    else
	    { 
	    	System.out.println("You are Fail");
	    }
			
		return m;
	}

}


public class P17_Marks_Using_Methods {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Marks : ");
		int m1 = sc.nextInt();
		
		Result R = new Result();
		R.Marks(m1);
		
	}
	
}
