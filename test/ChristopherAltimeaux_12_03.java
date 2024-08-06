package test;
import java.util.Scanner;
import java.util.Random;
/*
 * Christopher Altimeaux
 * Chapter 12 Assignment 3
 * A program that generates an array of 100 random numbers and allows the user to enter an index of the array. If the index is out of bounds, then an error message is displayed.
 */
public class ChristopherAltimeaux_12_03 {
	public static void main(String arg[]) {
		// Creates an array that will later store 100 random numbers.
		int numbers[] = new int[100];
		
		// Instantiates a Random object.
		Random rand = new Random();
		
		// A for loop that will generate 100 random numbers by calling the Random.nextInt() method and add them to the numbers array.
		for (int i = 0 ; i < 100; i++) {
			numbers[i] = rand.nextInt(100);	
		}
		
		// A try/catch block that will handle an error if the user enters an index out of bounds.
		try {
			// Creates a Scanner object.
			Scanner input = new Scanner(System.in);
			
			// Prompts the user to enter a index from 0 to 99.
			System.out.print("Enter an index from 0 to 99: ");
			int index = input.nextInt();
			
			System.out.print("Your number is: " + numbers[index]);
		// Prints the error message if the user enters an index out of bounds.
		 } catch (Exception e) {
				System.out.println("Out of Bounds");
		   }
	}
}
