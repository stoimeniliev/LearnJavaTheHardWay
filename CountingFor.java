import java.util.Scanner;

public class CountingFor
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        int message = keyboard.nextInt();

        for ( int n = 0 ; n <= message ; n++ )
        {
            if ( n % 3 == 0)
			{
				System.out.println( "Buzz" );
			}
			else
			{
			System.out.println( n );
			}
        }

    }
}