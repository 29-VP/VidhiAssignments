package Assignment_CoreJava;
import java.util.Scanner;

public class P1_GreatestNumber {
public static void main( String[] args) {

// Prog1 - Take 3 numbers from the User and Print the greatest Number.

	System.out.println("Enter Number1 = ");
	System.out.println("Ente Number2 = ");
	System.out.println("Enter Number3 = ");
	
Scanner myobj = new Scanner(System.in);

int num1 = myobj.nextInt();
int num2 = myobj.nextInt();
int num3 = myobj.nextInt();

myobj.close();

//System.out.println("Number 1 is :"+num1);
//System.out.println("Number 2 is :"+num2);
//System.out.println("Number 3 is :"+num3);

if (num1 >= num2 && num1 >= num3)
{

	System.out.println("Number 1 is Greater");
}	
else if (num2 >= num1 && num2 >= num3)
{
	System.out.println("Number 2 is Greater");
}
		
else if (num3 >= num1 && num3 >= num2)
 {
       System.out.println("Number 3 is Greater");
        	
 }

else
	{
	   System.out.println("Invlid Number");
	}

}

}


