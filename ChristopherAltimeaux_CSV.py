# A program that allows an instructor to enter a variable number of students and their three exam scores and displays
# the information in a tabular format.

import csv

# A function that will prompt the instructor to enter the number of students and their scores. It will then store it
# as a csv file.
def collect_scores():
    # Uses the with context manager to open a csv file in write-mode and saves it as a file-object.
    with open("grades.csv", "w", newline="") as grades_csv:

        # A variable that will store the fieldnames of the csv in a list.
        FIELDS = ["First Name", "Last Name", "Exam 1", "Exam 2", "Exam 3"]

        # Prompts the user to enter the number of students they have in their class.
        num_of_students = int(input("Please enter the number students: "))

        # Creates a writer object that will convert data into delimited strings.
        writer = csv.writer(grades_csv)

        # Calls the writer object's .writerow() method to write the header row using the FIELDS variable.
        writer.writerow(FIELDS)

        # A for loop that will prompt the user enter each student's name and test scores and writes it in the
        # grades.csv file.
        for i in range(num_of_students):
            # Creates a list that will hold the values of a particular student.
            student_info = []

            # Prompts the user to enter information about a student and stores it in its respective variable.
            first_name = input("Please enter the student's first name: ")
            last_name = input("Please enter the student's last name: ")
            grade_1 = int(input("Please enter the student's Exam 1 score: "))
            grade_2 = int(input("Please enter the student's Exam 2 score: "))
            grade_3 = int(input("Please enter the student's Exam 3 score: "))

            # Appends the information to the student_info list.
            student_info.append(first_name)
            student_info.append(last_name)
            student_info.append(grade_1)
            student_info.append(grade_2)
            student_info.append(grade_3)

            # Uses the writer object's .writerow() method to write the student's information to the csv file.
            writer.writerow(student_info)


# A function that will read the contents of a csv file and display the data as a table.
def display_scores(csv_file):
    # Uses the with context manager to open csv_file in read-mode.
    with open(csv_file, "r") as scores_csv:
        # Creates a reader object that will be used to read the csv file.
        reader = csv.reader(scores_csv)
        # A for loop that iterates through each row in the reader object.
        for row in reader:
            # A print statement that uses the spec field of the format method to add padding and alignment; similar
            # to that of a table.
            print("{:15} {:15} {:7} {:7} {:7}".format(row[0], row[1], row[2], row[3], row[4]))


# Calls the collect_scores function to create the csv file.
collect_scores()
# Calls the display_scores method to display the score of the csv in a tabular format.
display_scores("grades.csv")