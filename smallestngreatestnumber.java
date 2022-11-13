//chalo
/* the user inputs three number and the program determines the small and greater number*/
package Ogeto;
import java.util.Scanner;   // we call it Java. util because it utilises the class
public class smallestngreatestnumber {
	

	 //our class name
		public static void main(String[]args)
		{
			Scanner input=new Scanner(System.in); // allows inputing of values
			int numbe1, number2, number3;
			System.out.print("input  your first number here");//instruct the user to enter the data
			
			number1= input.nextInt(); // allows the inputing of data into  the system
	System.out.print("input  your second number here");
			
	number2= input.nextInt();
	System.out.print("input  your third number here");
			
	number3= input.nextInt();
			if ((number1>number2)==true) // here we will use the repetition function
			{
				if(number1>number2) {
					System.out.print( "the largest number is:"+number1);
					
				}
				else
				{
					System.out.print("the smallest number is:"+number2);//output once the boolean turns false
				}
			}
			if ((number1>number2)==false)
			{
				if(number2>number3)
				{
					System.out.print( "the largest number is :"+number2);
				}
				else
				{ 
					System.out.print("the smallest number is :"+number3); // outputs this nce the boolean turns true
				}
			}
			System.out.print("\n");
			//this is to display the smallest
			
			
			if ((number1<number2)==false) // here we will use the repetition function
			{
				if(number1<number3) {
					System.out.print( "the largest number is:"+number1);
					
				}
				else
				{
					System.out.print("the smallest number is:"+number3);//output once the boolean turns false
				}
			}
			if ((number1<number2)==true)
			{
				if(number2<number3)
				{
					System.out.print( "the largest number is :"+number2);
				}
				else
				{ 
					System.out.print("the smallest number is :"+number3); // outputs this nce the boolean turns true
				}
			}
		}
				


}
