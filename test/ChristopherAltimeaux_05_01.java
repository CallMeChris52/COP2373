package test;
import java.util.Scanner;
/*
 * Christopher Altimeaux
 * Chapter 5 Assignment 5.1
 * A program that allows the user to enter a series of integers and returns the number of positive and negative numbers.
 */
public class ChristopherAltimeaux_05_01 {
	public static void main(String args[]) {
		// Creates a new Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Creates two counter variables to track the positive and negative numbers.
		int numOfPositive = 0;
		int numOfNegative = 0;
		
		// Initializes a variable that will be used as store the user's input and  as a condition for the while loop.
		int userNumber = 1;
		
		// Starts a while loop.
		while (userNumber != 0) {
			// Prompts the user to enter an integer and uses the Scanner object's nextInt() method to read the user's input.
			System.out.print("Please enter an integer. When you are you finished, enter 0 to continue: ");
			userNumber = input.nextInt();
			
			// An if/else block that decides whether userNumber is positive or negative.
			if (userNumber > 0) {
				numOfPositive++;
			} else if (userNumber < 0) {
				numOfNegative++;
			}
		}
		
		// Outputs the number of positive and negative integers.
		System.out.println(String.format("There are %d positive numbers and %d negative numbers.", numOfPositive, numOfNegative));
		
	}
}
