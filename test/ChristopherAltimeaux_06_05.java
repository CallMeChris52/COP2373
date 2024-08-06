package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Christopher Altimeaux
 * Chapter 6 Assignment 6.5
 * A program that allows the user to enter three digits and outputs the numbers in ascending order.
 */
public class ChristopherAltimeaux_06_05 {
	// A method that will  accept the users' numbers and sort them.
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		
		// Creates an ArrayList with a size of 3 that will store the users' numbers.
		ArrayList<Double> userNumbers = new ArrayList<Double>(3) ;
		
		
		// Calls the ArrayList .add() method to add each number to the userNumbers ArrayList.
		userNumbers.add(num1);
		userNumbers.add(num2);
		userNumbers.add(num3);
		
		// Calls the Collections class' .sort() method to sort the numbers in ArrayList.
		Collections.sort(userNumbers);
		
		System.out.print("Your numbers in increasing order are: ");
		// A for each loop that will print each number in order.
		for (double i : userNumbers) {
			System.out.print(i + " ");
		}
	}
	public static void main(String args[]) {
		// Creates a new Scanner object to accept user input.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter three numbers.
		System.out.print("Please enter three numbers: ");
				
		// Calls the Scanner object's .nextDouble() method three times to read three inputs and assigns it to a variable.
		double userNum1 = input.nextDouble();
		double userNum2 = input.nextDouble();
		double userNum3 = input.nextDouble();
		
		// Calls the displaySortedNumbers on the users' numbers.
		displaySortedNumbers(userNum1, userNum2, userNum3);
	}
}
