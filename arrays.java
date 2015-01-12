import java.util.Random;
import java.util.*;

public class arrays
{
    public static void main( String[] args )
    {
    Random rng = new Random();
    int myIntArray[];
	for (int i = 0; i<=10; i++)
    { 
		int x = rng.nextInt(100);
		myIntArray[] = addElement(x);
        System.out.println(myIntArray);
	}
    }
}