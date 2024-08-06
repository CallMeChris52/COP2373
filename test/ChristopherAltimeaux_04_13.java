package test;
import java.util.Scanner;

/*
 * Christopher Altimeaux
 * Chapter 4 Assignment 4.13
 * A program that will prompt the user to enter a letter and will inform them if it is a vowel or consonant.
 */
public class ChristopherAltimeaux_04_13 {
	public static void main(String[] args) {
		// Initialize a variable that holds the letters of the alphabet and vowels.
		String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		String vowels = "a e i o u";
		
		// Creates a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter a letter and reads their input using the .nextLine() method.
		System.out.print("Please enter a letter: ");
		String letter = input.nextLine();
		
		// An if/else block that evaluates the users' input and returns an appropriate response. 
		if (alphabet.contains(letter) || alphabet.toUpperCase().contains(letter)) {
			if (vowels.contains(letter) || vowels.toUpperCase().contains(letter)) {
				System.out.println("This letter is a vowel.");
				} else {
					System.out.println("This letter is a consonant.");
					}
			} else {
			System.out.println("Invalid input. Please enter a single letter.");
		}
	}
}
