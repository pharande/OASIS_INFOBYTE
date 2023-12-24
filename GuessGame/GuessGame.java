/*
 Author - pratiksha pharande
Java Development Intern - Oasis Infobyte 
	Task 2 - Number Guessing Game
*/
import java.util.Scanner;
import java.util.Random;
public class GuessGame
{
	public static void main(String[] args) 
	{
		Random random = new Random(); // Importing Random Class to genarate random number
		Scanner sc = new Scanner(System.in); // Importing Scanner Class to take input from user
		int randNum = random.nextInt(101); // Giving the range of random number to generate number upto 100 
		int guess;
		boolean correct = false;
		System.out.println("_______Guessing Number Game !!!!!_______ ");
		System.out.println("_______As a player you have to guess no. between 1 to 100 until it's correct______");

		while (!correct)   // running while loop until correct is false
		{
			System.out.println("Guess the Number between 1 to 100");
			guess = sc.nextInt();

			if(guess<randNum)
			{
				System.out.println("Entered Number is Too Low !! Try Again !!");
				
			}
			else if(guess>randNum)
			{
				System.out.println("Entered Number is Too High !! Try Again !!");
				
			}
			else if(guess==randNum)
			{
				System.out.println("You guess the write Number");
				correct = true;
			}
			
		}
		sc.close();
	}
}