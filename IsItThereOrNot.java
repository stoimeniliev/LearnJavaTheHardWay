import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class IsItThereOrNot

{
    public static void main( String[] args )
    {
	try{
		int [] myIntArray = new int [ 10 ];
	
		PrintWriter fileout;
		fileout = new PrintWriter(new FileWriter("utto.txt"));
		Random r = new Random();
		int n=0;
		Scanner keyboard = new Scanner(System.in);
	
	
	
		System.out.print("Array:");
		for (int i = 0; i < myIntArray.length; i++)
		{ 
		
		
			myIntArray[i] = r.nextInt(100);
			System.out.print(myIntArray[i] + " ");
			
		}
	
		int user = keyboard.nextInt();
	
		for (int i = 0; i < myIntArray.length; i++)
		{ 
			if ( user == myIntArray[i])
			{ 
				n++;
			}
		}
		if ( n == 0 )
		{
		
		System.out.println("Your number didnt appear in the array");
		}
		else {
		System.out.println("The number you wrote appeared " + n + " times");
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
