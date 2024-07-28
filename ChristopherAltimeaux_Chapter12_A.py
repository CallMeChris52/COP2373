# A program that will use the numpy package to analyze the student grades stored in a CSV files and display various
# statistical calculations.

import numpy as np
import csv


# A function that will load the data from the grades.csv file into a numpy array.
def main():
    # A list that will store all the csv data.
    csv_list = []
    # Uses the context manager to open grades.csv in read mode.
    with open("grades.csv", "r") as csv_file:
        # Creates a csv reader object using the grades.csv file object.
        reader = csv.reader(csv_file)
        # Creates an empty list that will be used to store the contents of the csv file.
        csv_list = []
        # A for loop that will iterate through each row in the reader object and add it to csv_list.
        for row in reader:
            csv_list.append(row)
        # Calls the numpy .array() method to convert  csv_list into a numpy array.
        array = np.array(csv_list)
        # Calls the numpy . delete() method to delete the header row and the first and last name columns from the array.
        array = np.delete(array, 0, 0)
        array = np.delete(array, (0, 1), 1)
        # Calls the .astype() method to convert array elements from strings into integers.
        array = array.astype(int)
        # Prints the first three rows of the array.
        print(array[0:3])

    # Uses multidimensional slicing to assign all scores of particular exam to an array.
    exam1_scores = array[:, 0:1]
    exam2_scores = array[:, 1:2]
    exam3_scores = array[:, 2:3]

    # Calculates the mean of each exam by calling the numpy .mean() method.
    print(f"\nThe average score for Exam 1 is: {np.mean(exam1_scores)}%")
    print(f"The average score for Exam 2 is: {np.mean(exam2_scores)}%")
    print(f"The average score for Exam 3 is: {np.mean(exam3_scores)}%\n")

    # Calculates the median of each column by calling the numpy .median() method.
    print(f"The median of score of Exam 1 is: {np.median(exam1_scores)}%")
    print(f"The median of score of Exam 2 is: {np.median(exam2_scores)}%")
    print(f"The median of score of Exam 3 is: {np.median(exam3_scores)}%\n")

    # Calculates the standard deviation of each exam by calling the numpy .std() method.
    print(f"The standard deviation of Exam 1 is: {np.std(exam1_scores)}%")
    print(f"The standard deviation of Exam 2 is: {np.std(exam2_scores)}%")
    print(f"The standard deviation of Exam 3 is: {np.std(exam3_scores)}%\n")

    # Calculates the lowest score of each exam by calling the numpy .min() method.
    print(f"The lowest score of Exam 1 is: {np.min(exam1_scores)}%")
    print(f"The lowest score of Exam 2 is: {np.min(exam2_scores)}%")
    print(f"The lowest score of Exam 3 is: {np.min(exam3_scores)}%\n")

    # Calculates the highest score of each exam by calling the numpy .max() method.
    print(f"The highest score of Exam 1 is: {np.max(exam1_scores)}%")
    print(f"The highest score of Exam 2 is: {np.max(exam2_scores)}%")
    print(f"The highest score of Exam 3 is: {np.max(exam3_scores)}%\n")

    # Calculates the mean, median, standard deviation, minimum, and maximum scores.
    print(f"The average score across all exams is: {np.mean(array)}%")
    print(f"The median score across all exams is: {np.median(array)}%")
    print(f"The standard deviation across all exams is {np.std(array)}%")
    print(f"The minimum score across all exams is: {np.min(array)}%")
    print(f"The maximum score across all exams is: {np.max(array)}%\n")

    # Uses a Boolean array as a mask to calculate how many people passed each exam with a 60% or higher.
    num_of_exam1_passes = len(exam1_scores[exam1_scores >= 60])
    num_of_exam2_passes = len(exam2_scores[exam2_scores >= 60])
    num_of_exam3_passes = len(exam3_scores[exam3_scores >= 60])

    # Calculates and displays how many students each exam with a 60% or higher.
    print(f"There were {num_of_exam1_passes} students who passed Exam 1 with a 60% or higher.")
    print(f"There were {num_of_exam2_passes} students who passed Exam 2 with a 60% or higher.")
    print(f"There were {num_of_exam3_passes} students who passed Exam 3 with a 60% or higher.\n")

    # Calculates the overall pass percentage of all exams.
    pass_rate = (num_of_exam1_passes + num_of_exam2_passes + num_of_exam3_passes) / array.size * 100
    print(f"The overall pass rate of all exams is: {pass_rate}%")

# Calls the main() function.
main()
