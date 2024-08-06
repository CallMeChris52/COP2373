package test;
import java.util.Scanner;
/*
 * Christopher Altimeaux
 * Chapter 3 Assignment 3.17
 * A program that allows users to play a game of rock paper scissors.
 * The user selects a symbol to use and the program will respond with its own randomly selected symbol.
 */
public class ChristopherAltimeaux_03_17 {
	//A method that will convert the program's randomly selected number and the user's input into an appropriate symbol.
	public static String numberConverter(int number) {
		if (number == 0) {
			return "Rock";
		} else if (number == 1) {
			return "Paper";
		} else if (number == 2) {
			return "Scissors";
		}
		return null;
	}
	
	public static void main(String args[]) {
		// Uses the Math class' random method to select a random number and multiplies it by 3 to create three possible values: 0, 1, or 2.
		int computerNumber = (int)(Math.random() * 3);
		
		//Creates a Scanner object.
		Scanner input =  new Scanner(System.in);
		int userNumber;
		
		// A while loop that will continually ask the user to enter a number until they have entered a valid input.
		while (true) {
			System.out.print("Welcome to Rock-Paper-Scissors! Please enter a number to use a symbol: Rock(0) Paper(1) Scissors(2): ");
			userNumber = input.nextInt();
			if (userNumber == 0 || userNumber == 1 || userNumber == 2) {
				break;
			} else {
				System.out.println("Invalid input. Please enter 0, 1, or 2.");
			}
		}
		
		
		// Calls the numberConverter method to change the numbers into symbols for the game.
		String computerChoice = numberConverter(computerNumber);
		String userChoice = numberConverter(userNumber);
		
		//Displays each players' symbol.
		System.out.println("I choose " + computerChoice + ".");
		System.out.println("You chose " + userChoice + ".");
	
		
		// An if/else if/else block that determines who the winner is.
		if (userChoice == computerChoice) {
			System.out.println("It's a draw.");
		} else if (userChoice == "Rock" && computerChoice == "Paper") {
			System.out.println("I win!");
		} else if (userChoice == "Rock" && computerChoice == "Scissors") {
			System.out.println("You win!");
		} else if (userChoice == "Paper" && computerChoice == "Scissors" ) {
			System.out.println("I win!");
		} else if (userChoice == "Scissors" && computerChoice == "Paper") {
			System.out.println("You Win!");
		} else if (userChoice == "Scissors" && computerChoice == "Rock") {
			System.out.println("I win!");
		} else if (userChoice == "Paper" && computerChoice == "Rock") {
			System.out.println("You win!");
		}
		
	}
}
