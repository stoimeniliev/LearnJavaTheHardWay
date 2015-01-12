import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class HangmanEdit

{
    public static void main( String[] args )
    {
	
	String [] myIntArray = {"apple","mango","peach","banana"};
	

	Random r = new Random();
	int duma = r.nextInt(myIntArray.length);
	String chosen = myIntArray[duma];
	String [] guessword = new String[chosen.length()];
	Scanner keyboard = new Scanner(System.in);
	ArrayList<String> guessed = new ArrayList<String>();
	int tries = 10;
	System.out.print("The word you have to guess is:" + chosen);
	
	while ( tries != 0 )
	{
		for (int i = 0; i < chosen.length(); i++)
		{ 
			guessword[i] = "- ";
		
		
			System.out.print(guessword[i]);
			
		}
		String guess = keyboard.next();
		guessed.add(guess);
	
		String[] bukvi = chosen.split("(?<!^)");
		for (int i = 0; i < chosen.length(); i++)
		{ 
			if ( chosen.containsAll(guess) )
			{ 
				guessword[chosen.indexOf(guess)] = guessword[chosen.indexOf(guess)].replace("- ", guess);
				System.out.println("Correct! " + guessword[chosen.indexOf(guess)] + " appears in the word");
				tries--;
			
			}
			else { 
				System.out.println("It does not contain this character");
				tries--; }
		
		}
	
	
		for (int n = 0; n < chosen.length(); n++)
		{ 
			System.out.print(guessword[n]);
		
		}
	}
	
	
	
	
	}

}