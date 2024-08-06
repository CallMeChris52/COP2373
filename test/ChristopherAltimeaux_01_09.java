package test;
/*
 * Christopher Altimeaux
 * Chapter 1 Assignment 1.9
 * A program that displays the area and perimeter of a 4.5x7.9 rectangle. 
 */

public class ChristopherAltimeaux_01_09 {
	public static void main(String[] args) {
		//Initializes the area and perimeter variables and sets them equal to their respective formulas.
		double area = 4.5 * 7.9;
		double perimeter = 2 * (4.5 + 7.9);
		
		//Displays the area and perimeter values to the console.
		System.out.println("The area is: " + area);
		System.out.println("The perimeter is: " + perimeter);
	}
}