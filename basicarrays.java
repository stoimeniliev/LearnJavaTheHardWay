import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class basicarrays

{
    public static void main( String[] args )
    {
    int size = 100;
    int[] myIntArray = new int [100];
	Random r = new Random();	
	
	for (int i = 0; i <= 1000; i++)
    { 
		myIntArray[i] = r.nextInt(100);
        System.out.println(myIntArray[i]);
	}
	
    }
}