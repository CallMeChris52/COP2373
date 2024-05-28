# A program that accepts a list of a users' expenses and returns the total expense, highest expense and lowest expense.

# Import the functools module.
import functools


# A function that will ask users to input their expenses and calculate the total.
def main():
    # A nested function that will accept the users' inputs.
    def enter_expenses():
        #Creates an empty dictionary that will hold the users' expenses.
        global expenses
        expenses = {}

        # A while loop that will continue to ask the user to enter expenses until they are done.
        while True:
            print(expenses)
            user_type = input("Please enter the type of expense. If you are finished adding expenses, then press enter key to continue: ")
            if user_type == "":
                break
            user_amount = "0"
            # A nested while loop that ensures the amount that the user enters is valid.
            while type(user_amount) != float:
                # A try-except clause to ensure that the string the user enters can be converted into a float.
                try:
                    user_amount = float(input("Please enter the amount for this expense: $"))

                except:
                    print("Please enter a valid amount.")

            # A nested while loop that ensures the number the user enters is greater of 0.
            while user_amount < 0:
                print("Please enter a value greater than 0.")
                user_amount = float(input("Please enter the amount for this expense: $"))

            # Adds each expense and its amount to the expenses dictionary.
            expenses[user_type] = user_amount

    # A function that will calculate the total expense, highest expense, lowest expense.
    def calculate_expenses():
        # Create variables that will store their respective values and perform calculations.
        total_expense = functools.reduce(lambda a, b: a + b, expenses.values() )
        highest_expense = max(expenses.values())
        lowest_expense = min(expenses.values())

        print(f"Your total expense is: ${total_expense}. Your highest expense is {highest_expense} and your lowest expense is {lowest_expense}.")

    enter_expenses()
    calculate_expenses()

main()