import java.util.Scanner;

public class 2questions
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Question 1: Is it an animal, vegetable, or mineral");
		chosen = keyboard.next();
		System.out.println("Question 2: Is it smaller or bigger");
		chosen2 = keyboard.next();
		
		if ( chosen == "animal")
		{	
			if ( chosen2 == "yes")
			{
				System.out.println("You are thinking of a moose");
			}
			else if (chosen2 == "no")
			{
				System.out.println("You are thinking of a squirrel");
		    }
		}
	}
}