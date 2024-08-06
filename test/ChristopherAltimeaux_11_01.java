package test;
import java.util.Scanner;
/*
 * Christopher Altimeaux
 * Chapter 11 Assignment 11.1
 * A program that features a special Triangle_CA class that inherits from the GeometricObject class. 
 * Triangle_CA objects will have access to all the methods in the GeometricObject class in addition to their own unique methods.
 */

// A class that will allow the creation of Triangle objects along with all its methods and data fields.
//class Triangle_CA extends GeometricObject {
//	//Creates three side data fields with a default value of 1.0.
//	double side1 = 1.0;
//	double side2 = 1.0;
//	double side3 = 1.0;
//	
//	// A no-arg constructor that creates a Trinagle_CA object with default values when no arguments are passed during instantiation.
//	Triangle_CA() {
//		
//	}
//	
//	// A constructor that uses the values passed in to set each side of the triangle.
//	Triangle_CA(double side1, double side2, double side3) {
//		this.side1 = side1;
//		this.side2 = side2;
//		this.side3 = side3;
//	}
//	
//	// Accessor methods will return the value of each side.
//	double getSide1() {
//		return this.side1;
//	}
//	
//	double getSide2() {
//		return this.side2;
//	}
//	
//	double getSide3() {
//		return this.side3;
//	}
//	
//	// A public method that returns the perimeter of the triangle.
//	public double getPerimeter() {
//		double perimeter = this.side1 + this.side2 + this.side3;
//		return perimeter;
//	}
//	
//	// A public method that returns the area of the triangle.
//	public double getArea() {
//		return 0;
//	}
//	
//	// A .toString() method that displays information about the triangle when a Triangle_CA object is printed.
//	public String toString() {
//		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
//	}
//}

public class ChristopherAltimeaux_11_01 {
	public static void main(String[] args) {
		// Creates a Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user the length of each side of the triangle calling the Scanner object's .nextDouble
		System.out.print("Enter the length of side 1: ");
		double side1 = input.nextDouble();
		System.out.print("Enter the length of side 2: ");
		double side2 = input.nextDouble();
		System.out.print("Enter the length of side 3: ");
		double side3 = input.nextDouble();
		
		// Creates a Triangle_CA object using the side lengths provided by the user.
		Triangle_CA t1 = new Triangle_CA(side1, side2, side3);
		
		// Prompts the user to enter a color.
		System.out.print("Please enter a color: ");
		String color = input.next();
		
		// Sets the Triangle_CA object's color to the user specified color.
		t1.setColor(color);
		
		// Asks the user whether the shape is filled or not.
		System.out.print("Is the shape filled? (Enter true or false.): " );
		boolean isFilled = input.nextBoolean();
		
		// Sets the Triangle_CA object's isFilled status to the one provided by the user.
		t1.setFilled(isFilled);
		
		// Displays information about the Triangle_CA object.
		System.out.println("Perimeter: " + t1.getPerimeter());
		System.out.println("Color: " + t1.getColor());
		System.out.println("Is Filled?: " + t1.isFilled());
		System.out.println(t1);
	}

}
