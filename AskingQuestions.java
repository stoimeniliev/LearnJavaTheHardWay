import java.util.Scanner;

public class AskingQuestions
{	
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String height;
		double weight;
		
		System.out.print( "How old are you?");
		age = keyboard.nextInt();
		
		System.out.print( "How old are you?");
		height = keyboard.next();
		
		System.out.print( "How old are you?");
		weight = keyboard.nextDouble();
		System.out.print( "So you are" + age + " " + " old, " + height + " tall and " + weight + "heavy." );
		
	}
}