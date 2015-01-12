import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class FindingTheLargestValueInAnArray

{
    public static void main( String[] args )
    {
	
	int [] myIntArray = new int [ 10 ];
	

	Random r = new Random();
	int n=0;

	
	
	
	System.out.print("Array:");
	for (int i = 0; i < myIntArray.length; i++)
	{ 
		
		
		myIntArray[i] = r.nextInt(100);
		System.out.print(myIntArray[i] + " ");
			
	}
	
		
	
	for (int i = 0; i < myIntArray.length; i++)
	{ 
		if ( myIntArray[i] > n)
		{ 
			n = myIntArray[i];
		}
	}

	System.out.println("The largest value is " + n);
	}
	
	}

