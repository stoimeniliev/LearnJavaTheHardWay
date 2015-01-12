import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class GradesInAnArrayAndFile

{
    public static void main( String[] args )
    {
	try{
		int [] myIntArray = new int [ 5 ];
	
		PrintWriter fileout;
		fileout = new PrintWriter(new FileWriter("utto.txt"));
		Random r = new Random();
	
		Scanner keyboard = new Scanner(System.in);
	
		String user_name = keyboard.next();
		String last_name = keyboard.next();
	
	
		for (int i = 0; i < myIntArray.length; i++)
		{ 
		
		
			myIntArray[i] = r.nextInt(100);
			System.out.println("Grade" + (i + 1) + ":" + myIntArray[i]);
			fileout.println("Grade" + (i + 1) + ":" + myIntArray[i]);
		}
	
		System.out.println(user_name);
		System.out.println(last_name);
		fileout.println(user_name);
		fileout.println(last_name);
		fileout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}