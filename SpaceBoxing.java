import java.util.Scanner;

public class SpaceBoxing
{
	public static void main ( String[] args )
	{
		Double venus, mars, jupiter, saturn, uranus, neptune, weight,choice;
		venus = 0.78;
		mars = 0.39;
		jupiter = 2.65;
		saturn = 1.17;
		uranus = 1.05;
		neptune = 1.23;
		
		System.out.println("Please enter your weight");
		
		
		Scanner keyboard = new Scanner(System.in);
		weight = keyboard.nextDouble();
		
		System.out.println("Choose a planet");
		System.out.println("1. Venus  2. Mars   3. Jupiter");
		System.out.println("4. Saturn 5. Uranus 6. Neptune");
		choice = keyboard.nextDouble();
	
		
		if ( choice == 1 )
		{
			System.out.println( "Yourweight is" + weight/venus);
		}
		if ( choice == 2 )
		{
			System.out.println( "Yourweight is" + weight/mars);
		}
		
		if ( choice == 3 )
		{
			System.out.println( "Yourweight is" + weight/jupiter);
		}	
		
		if ( choice == 4 )
		{
			System.out.println( "Yourweight is" + weight/saturn + "in saturn");
		}
		
		if ( choice == 5 )
		{
			System.out.println( "Yourweight is" + weight/uranus + "in uranus" );
		}
		
		if ( choice == 6 )
		{
			System.out.println( "Yourweight is" + weight/neptune + "in neptune");
		}
		
		
	}
}