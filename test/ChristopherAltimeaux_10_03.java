package test;
/*
 * Christopher Altimeaux
 * Chapter 10 Assignment 10.3
 * A program that features an integer class that allows the creation of special integer objects. These objects include unique features such returning whether the integer is even or odd.
 */

// The class that will allow the creation of the special integer objects.
class MyInteger_CA {
	// Creates a data field that will store the value of the 
	int value;
	
	// A constructor that will allow users to pass in a value for the value data field when an object is instantiated.
	MyInteger_CA(int value) {
		this.value = value;
	}
	
	// A getter method that returns the value of the MyInteger_CA object.
	int getValue() {
		return this.value;
	}
	
	// A class method that returns true if the integer object holds an even value.
	boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// A class method that returns true if the integer object holds an odd value.
	boolean isOdd() {
		if (this.value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// A static that returns true if an integer is even.
	static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// A static that returns true if an integer is odd.
	static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// A static method that returns true if an instance of MyInteger_CA is even.
	static boolean isEven(MyInteger_CA myInt) {
		if (myInt.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// A static method that returns true if an instance of MyInteger_CA is odd.
	static boolean isOdd(MyInteger_CA myInt) {
		if (myInt.getValue() % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// A class method that returns true if an int object is equal to the value of a MyInteger_CA object.
	boolean equals(int value) {
		if (this.value == value) {
			return true;
		} else {
			return false;
		}
	}
	
	// A class method that checks if another MyInteger_CA object is equal to an instance of a MyInteger_CA object.
	boolean equals(MyInteger_CA myInt) {
		if (this.value == myInt.getValue()) {
			return true;
		} else {
			return false;
		}
	}
}

public class ChristopherAltimeaux_10_03 {
	public static void main(String[] args) {
		// Creates two MyInteger objects and one primitive integer object.
		MyInteger_CA int1 = new MyInteger_CA(44);
		MyInteger_CA int2 = new MyInteger_CA(35);
		int int3 = 44;
		
		// Uses the .getValue() method of the MyInteger_CA class to get the value of the object and prints it to the console.
		System.out.println("The value of int1 is: " + int1.getValue());
		System.out.println("The value of int2 is: " + int2.getValue());
		System.out.println("The value of int3 is: " + int3);
		
		// Uses the .isEven() method of the MyInteger_CA class to determine if a MyInteger_CA object is even.
		System.out.println("Int2 is even: " + int2.isEven());
		
		// Uses the .isOdd() method of the MyInteger_CA class to determine if a MyInteger_CA object is odd.
		System.out.println("Int2 is odd: " + int2.isOdd());
		
		// Calls the .isEven() static method from the MyInteger_CA class to determine if an int object is even.
		System.out.println("Int3 is even: " + MyInteger_CA.isEven(int3));
		
		// Calls the .isOdd() static method from the MyInteger_CA class to determine if an int object is odd.
		System.out.println("Int3 is odd: " + MyInteger_CA.isOdd(int3));
		
		// Calls the .isEven() static method from the MyInteger_CA class to determine if a MyInteger_CA object is even.
		System.out.println("Int1 is even: " + MyInteger_CA.isEven(int1));
		
		// Calls the .isOdd() static method from the MyInteger_CA class to determine if a MyInteger_CA object is odd.
		System.out.println("Int1 is odd: " + MyInteger_CA.isOdd(int1));
		
		// Calls the .equals() method of the MyInteger_CA class to determine if an int object is equal to the value the MyInteger_CA object.
		System.out.println("Int1 is equal to int3: " + int1.equals(int3));
		
		// Calls the .equals() method of the MyInteger_CA class to determine if another MyInteger_CA object is equal to the value the MyInteger_CA object.
		System.out.println("Int1 is equal to int2: " + int1.equals(int2));
	}
}
