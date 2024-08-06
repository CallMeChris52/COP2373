package test;
/*
 * Christopher Altimeaux
 * Chapter 9 Assignment 9.1
 * A program that returns the width, height, area, and perimeter of two fixed rectangles.
 */
//// A  class that will allow the creation of rectangle objects with the appropriate methods and data fields.
//class Rectangle_CA {
//	// Creates two data fields with default values of 1.
//	double width = 1;
//	double height = 1;
//	
//	// A no-arg constructor that will create an object with default values if no arguments are passed during instantiation.
//	Rectangle_CA() {
//		
//	}
//	
//	// A constructor that will set the width and height equal to the values passed in when an object is instantiated.
//	Rectangle_CA(double width, double height) {
//		this.width = width;
//		this.height = height;
//	}
//	
//	// A class method that will calculate and return the area of the object.
//	double getArea() {
//		return this.width * this.height;
//	}
//	
//	// A class method that will calculate and return the perimeter of the object.
//	double getPerimeter() {
//		return 2 * this.width + 2 * this.height;
//	}
//	
//}

public class ChristopherAltimeaux_09_01 {
	// The main method.
	public static void main(String[] args) {
		// Creates two rectangles with fixed heights and lengths.
		Rectangle_CA rectangle1 = new Rectangle_CA(4, 40);
		Rectangle_CA rectangle2 = new Rectangle_CA(3.5, 35.9);
		
		// Two printf statement that will print the width, height, area, and perimeter of each rectangle using the get methods of the object.
		System.out.printf("A rectangle with a width of %f and a height of %f has an area of %f and a perimeter of %f.\n",
				rectangle1.width, rectangle1.height, rectangle1.getArea(), rectangle1.getPerimeter());
		System.out.printf("A rectangle with a width of %f and a height of %f has an area of %f and a perimeter of %f.\n",
				rectangle2.width, rectangle2.height, rectangle2.getArea(), rectangle2.getPerimeter());
		
	}
}
