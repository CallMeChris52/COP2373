package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/*
 * Christopher Altimeaux
 * Chapter 7 Assignment 7.1
 * A program that prompts the user to enter a pre-selected number of student scores and assigns a grade based on the best score.
 */
public class ChristopherAltimeaux_07_01 {
	// A method that calculates each student's grade based on the best grade.
	public static void assignGrade(int best, ArrayList<Integer> scores) {
		// A for loop that iterates through the list of scores and assigns a letter grade accordingly.
		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i) >= best -10) {
				System.out.println("Student " + (i + 1) + " scored " + scores.get(i) + "% and received an A.");
			} else if (scores.get(i) >= best -20) {
				System.out.println("Student " + (i + 1) + " scored " + scores.get(i) + "% and received a B.");
			} else if (scores.get(i) >= best -30) {
				System.out.println("Student " + (i + 1) + " scored " + scores.get(i) + "% and received a C.");
			} else if (scores.get(i) >= best -40) {
				System.out.println("Student " + (i + 1) + " scored " + scores.get(i) + "% and received a D.");
			} else {
				System.out.println("Student " + (i + 1) + " scored " + scores.get(i) + "% and received an F.");
			}
		}
	}
	public static void main(String[] args) {
		// Creates a Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Declares a variable that will be used later to allow the user to choose the number of students.
		int totalStudents;
		
		// Asks the user to enter the number of students and uses the Scanner class' .nextInt() to read their input.
		System.out.print("Please enter the total number of students: ");
		totalStudents = input.nextInt();
		
		// Creates an ArrayList with a size determined by the user.
		ArrayList<Integer> studentScores = new ArrayList<Integer>(totalStudents);
		
		// Prompts the user to enter each student's score.
		System.out.print("Enter each student's score: ");
		
		// A for loop that will add each score to the studentScores ArrayList.
		for (int i = 0; i < totalStudents; i++) {
			studentScores.add(input.nextInt());
		}
		// Uses the Collections class' .max() method to find the best score between the students.
		int bestScore = Collections.max(studentScores);
		
		// Invokes the assignGrade static method to assign a grade to each student and print it.
		assignGrade(bestScore, studentScores);
	}
}
