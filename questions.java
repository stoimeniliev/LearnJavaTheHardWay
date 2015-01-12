import java.util.Scanner;

public class questions
{
	public static void main( String[] args)
	{	Double responce;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Question 1: Is it an animal, vegetable, or mineral");
		responce = keyboard.nextDouble();
	
		
		if ( responce <= 16 )
		{	
		
			System.out.println("pod 16");
		}	
		
		if ( responce > 16 && responce < 18)
		{	
		
			System.out.println("16-17");
		}
		if ( responce >= 17 && responce <= 25 )
		{	
		
			System.out.println("18-24");
		}
		
	}
}