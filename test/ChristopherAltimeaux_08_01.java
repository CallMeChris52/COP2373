package test;

import java.util.Scanner;

/*
 * Christopher Altimeaux
 * Chapter  Assignment 8.1
 * A program that tells the user to input numbers for a 3-by-4 matrix and returns the sum of each column.
 */
public class ChristopherAltimeaux_08_01 {
	// A method that will calculate the sum of a specific column of a two dimensional array.
	public static double sumColumn(double[][] m, int columnIndex) {
		// A counter variable that will track the sum of a column and be returned at the end of the method.
		double sum = 0;
		
		// A nested for loop that will iterate through each element in the column and add it to the sum variable.
		 for (int row = 0; row < m.length; row++) {
			 sum += m[row][columnIndex];
			 }
		return sum;
	}
	public static void main(String args[]) {
		// Creates a Scanner object.
		Scanner input = new Scanner(System.in);
		
		//Initializes a 3-by-4 two dimensional array that will be used to store the user's matrix.
		double[][] userMatrix = new double[3][4];
		
		// Prompts the user to enter a 3-by-4 matrix and uses a nested for loop to read and store their input in the userMatrix array.
		System.out.println("Please enter a 3-by-4 matrix row by row: ");
		for (int row = 0; row < userMatrix.length; row++) {
			for (int column = 0; column < userMatrix[row].length; column++) {
				userMatrix[row][column] = input.nextDouble();
			}
		}
		// A for loop that will iterate through each column and invoke the sumColumn method to display the sum.
		for (int column = 0; column < userMatrix[0].length; column++) {
			System.out.println(String.format("Column %s has a total of %s.", column + 1, sumColumn(userMatrix, column)));
		}
	}
}
