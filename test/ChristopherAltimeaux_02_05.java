package test;
import java.util.Scanner;
/*
 * Christopher Altimeaux
 * Chapter 2 Assignment 2.5
 * A program that calculates the gratuity and total based on a user-inputed gratuity rate and subtotal.
 */
public class ChristopherAltimeaux_02_05 {
	public static void main(String args[]) {
		//Instantiates two objects from the Scanner class
		Scanner firstInput = new Scanner(System.in);
		Scanner secondInput = new Scanner(System.in);
		
		//Informs the user to enter a value and uses the Scanner class' .nextDouble() to read it.
		System.out.print("Please enter the subtotal: $");
		double subtotal = firstInput.nextDouble();
		
		
		System.out.print("Please enter the gratuity rate: ");
		//Divides rate by 100 to convert it from a percentage into a decimal.
		double gratuityRate = secondInput.nextDouble() / 100;
		
		//Initializes variables and assigns them to their respective calculation.
		double gratuity = subtotal * gratuityRate;
		double total = gratuity + subtotal;
		
		// Uses the format() method of the String class to print the calculated values with only 2 decimal places.
		System.out.println(String.format("With a gratuity of $%.2f, your total will be $%.2f.", gratuity, total));		
		
	}
}
