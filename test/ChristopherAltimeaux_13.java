package test;
import java.util.Scanner;
/*
 * Christopher Altimeaux
 * Chapter 13
 * A program that allows users to creates rectangles, circles, and triangles using the Rectangle_CA, Circle_CA, and Triangle_CA classes respectively.
 */
public class ChristopherAltimeaux_13 {
	// Main method.
	public static void main(String[] args) {
		// Creates a new Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter the length and width of the rectangle by calling the Scanner object's .nextDouble() method.
		System.out.print("Enter the length of the rectangle: ");
		double rectangleLength = input.nextDouble();
		System.out.print("Enter the width of the rectangle: ");
		double rectangleWidth = input.nextDouble();
		
		// Prompts the user to enter the color of the rectangle by calling the Scanner objects's .next() method.
		System.out.print("Enter the color of the rectangle: ");
		String rectangleColor = input.next();
		
		// Asks the user whether the rectangle is filled or not by calling the Scanner object's .nextBoolean() method.
		System.out.print("Is the rectangle filled? (true or false): ");
		boolean isRectangleFilled = input.nextBoolean();
		
		// Creates a Rectangle_CA object using the user's responses.
		Rectangle_CA r1 = new Rectangle_CA(rectangleWidth, rectangleLength, rectangleColor, isRectangleFilled);
		
		// Prompts the user to enter the radius of the circle by calling the Scanner object's .nextDouble() method.
		System.out.print("Enter the radius of the circle: ");
		double circleRadius = input.nextDouble();
				
		// Prompts the user to enter the color of the circle by calling the Scanner objects's .next() method.
		System.out.print("Enter the color of the circle: ");
		String circleColor = input.next();
				
		// Asks the user whether the circle is filled or not by calling the Scanner object's .nextBoolean() method.
		System.out.print("Is the circle filled? (true or false): ");
		boolean isCircleFilled = input.nextBoolean();
		
		// Creates a Circle_CA object using the user's responses.
		Circle_CA c1 = new Circle_CA(circleRadius, circleColor, isCircleFilled);
		
		// Prompts the user to enter each side length of the triangle by calling the Scanner object's .nextDouble() method.
		System.out.print("Enter the length of side 1 of the triangle: ");
		double triangleSide1 = input.nextDouble();
		System.out.print("Enter the length of side 2 of the triangle: ");
		double triangleSide2 = input.nextDouble();
		System.out.print("Enter the length of side 3 of the triangle: ");
		double triangleSide3 = input.nextDouble();
				
		// Prompts the user to enter the color of the triangle by calling the Scanner objects's .next() method.
		System.out.print("Enter the color of the trinagle: ");
		String triangleColor = input.next();
				
		// Asks the user whether the triangle is filled or not by calling the Scanner object's .nextBoolean() method.
		System.out.print("Is the triangle filled? (true or false): ");
		boolean isTriangleFilled = input.nextBoolean();
				
		// Creates a Rectangle_CA object using the user's responses.
		Triangle_CA t1 = new Triangle_CA(triangleSide1, triangleSide2, triangleSide3, triangleColor, isTriangleFilled);
		
		// Prints information about the Rectangle_CA object.
		System.out.println("Rectangle Stats");
		System.out.println("Area: " + r1.getArea());
		System.out.println("Perimeter: " + r1.getPerimeter());
		System.out.println("Color: " + r1.getColor());
		System.out.println("isFilled: " + r1.isFilled());
		System.out.println();
		
		// Prints information about the Circle object.
		System.out.println("Circle Stats");
		System.out.println("Area: " + c1.getArea());
		System.out.println("Perimeter: " + c1.getPerimeter());
		System.out.println("Color: " + c1.getColor());
		System.out.println("isFilled: " + c1.isFilled());
		System.out.println();
		
		// Prints information about the Triangle_CA object.
		System.out.println("Triangle Stats");
		System.out.println("Perimeter: " + t1.getPerimeter());
		System.out.println("Color: " + t1.getColor());
		System.out.println("isFilled: " + t1.isFilled());
		System.out.println();
		
		// Creates three GeometricObjects using the Rectangle_CA, Circle_CA, Triangle_CA classes respectively.
		GeometricObject r2 = new Rectangle_CA(rectangleWidth, rectangleLength);
		GeometricObject c2 = new Circle_CA(circleRadius);
		GeometricObject t2 = new Triangle_CA(triangleSide1, triangleSide2, triangleSide3);
		
		// Calls the equalsArea() static method to see if the area of two GeometricObjects are equal.
		System.out.printf("The areas of t2 and c2 are equal: %b\n", equalsArea(r2, c2));
		
		// Calls the equalsPerimeter() static method to see if the area of two GeometricObjects are equal.
		System.out.printf("The perimeters of t2 and c2 are equal: %b\n", equalsPerimeter(t2, c2));
		System.out.printf("The perimeters of t2 and r2 are equal: %b\n", equalsPerimeter(t2, r2));
		System.out.printf("The perimeters of r2 and c2 are equal: %b\n", equalsPerimeter(r2, c2));
	}
	// A method that returns true if the area of one GeometricObject is equal to the area of another.
	 public static boolean equalsArea(GeometricObject geoObject1, GeometricObject geoObject2) {
		  if (geoObject1.getArea() == geoObject2.getArea()) {
			  return true;
		  } else {
			  return false;
		  }
	  }
	  
	// A method that returns true if the perimeter of one GeometricObject is equal to the perimeter of another.
	  public static boolean equalsPerimeter(GeometricObject geoObject1, GeometricObject geoObject2) {
		  if (geoObject1.getPerimeter() == geoObject2.getPerimeter()) {
			  return true;
		  } else {
			  return false;
		  }
	  }
}

//A  class that will allow the creation of rectangle objects with the appropriate methods and data fields.
class Rectangle_CA extends GeometricObject {
	// Creates two data fields with default values of 1.
	double width = 1;
	double height = 1;
		
	// A no-arg constructor that will create an object with default values if no arguments are passed during instantiation.
	public Rectangle_CA() {
		
	}
		
	// A constructor that will set the width and height equal to the values passed in when an object is instantiated.
	public Rectangle_CA(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// A constructor that will set the width, height, color, and isFilled equal to the values passed in when an object is instantiated.
	public Rectangle_CA(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		this.setColor(color);
		this.setFilled(filled);
		}
		
	// A class method that will calculate and return the area of the object.
		public double getArea() {
		return this.width * this.height;
	}
		
	// A class method that will calculate and return the perimeter of the object.
	public double getPerimeter() {
		return 2 * this.width + 2 * this.height;
	}
		
	}
	
class Circle_CA extends GeometricObject {
	private double radius;
	
	public Circle_CA() {
	}
	
	public Circle_CA(double radius) {
		this.radius = radius;
	}
	
	public Circle_CA(double radius, 
	    String color, boolean filled) {
	    this.radius = radius;
	    setColor(color);
	    setFilled(filled);
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}
	  
	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}
	  
	/** Return perimeter */
	public double getPerimeter() {
	    return 2 * radius * Math.PI;
	}
	  
	}
	
// A class that will allow the creation of Triangle objects along with all its methods and data fields.
class Triangle_CA extends GeometricObject {
	//Creates three side data fields with a default value of 1.0.
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
		
	// A no-arg constructor that creates a Trinagle_CA object with default values when no arguments are passed during instantiation.
	public Triangle_CA() {
			
	}
		
	// A constructor that uses the values passed in to set each side of the triangle.
	public Triangle_CA(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	// A constructor that uses the values passed in to set each side of the triangle in addition to the color and isFilled data field.
	public Triangle_CA(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	// Accessor methods will return the value of each side.
	double getSide1() {
		return this.side1;
	}
		
	double getSide2() {
		return this.side2;
	}
		
	double getSide3() {
		return this.side3;
	}
		
	// A public method that returns the perimeter of the triangle.
	public double getPerimeter() {
		double perimeter = this.side1 + this.side2 + this.side3;
		return perimeter;
	}
		
	// A public method that returns the area of the triangle.
	public double getArea() {
		return 0;
	}
		
	// A .toString() method that displays information about the triangle when a Triangle_CA object is printed.
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
		}
	}
