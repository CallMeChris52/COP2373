# A program that accepts a list of a users' expenses and returns the total expense, highest expense and lowest expense.

# Import the functools module.
import functools


# A function that will ask users to input their expenses and calculate the total.
def main():
    # A nested function that will accept the users' inputs.
    def enter_expenses():
        # Creates two global lists that will hold information about each expense and will allow other functions to
        # access them.
        global expenses_type
        global expenses_amount
        expenses_type = []
        expenses_amount = []

        # A while loop that will continue to ask the user to enter expenses until they are done.
        while True:
            # A for loop that will print each expense every time one is added.
            for i in range(len(expenses_amount)):
                print(str(expenses_type[i]) + "\t" * 4 + str(expenses_amount[i]))

            # When the user is done adding expenses, they can continue by simply inputting an empty string which will
            # break the loop.
            user_type = input("Please enter the type of expense. If you are finished adding expenses, then press "
                              "enter key to continue: ")
            if user_type == "":
                break
            # Initializes a variable and sets it equal to an empty string; will be used later for a while loop.
            user_amount = ""

            # A nested while loop that ensures the amount that the user enters is valid.
            while type(user_amount) is not float:
                # A try-except clause to ensure that the string the user enters can be converted into a float.
                try:
                    user_amount = float(input("Please enter the amount for this expense: $"))

                except:
                    print("Please enter a valid amount.")

            # A nested while loop that ensures the number the user enters is greater than 0.
            while user_amount < 0:
                print("Please enter a value greater than 0.")
                user_amount = float(input("Please enter the amount for this expense: $"))

            # Adds each expense and its amount to its respective list.
            expenses_type.append(user_type)
            expenses_amount.append(user_amount)

    # A function that will calculate the total expense, highest expense, lowest expense.
    def calculate_expenses():
        # Create variables that will store their respective values and perform calculations.

        # Uses the functools reduce function to add each previous expense to the next.
        total_expense = functools.reduce(lambda a, b: a + b, expenses_amount)
        highest_expense = expenses_type[expenses_amount.index(max(expenses_amount))]
        lowest_expense = expenses_type[expenses_amount.index(min(expenses_amount))]

        # Prints the total, highest, and lowest expense.
        print(f"Your total expense is: ${total_expense:.2f}. Your highest expense is {highest_expense} and your lowest expense is {lowest_expense}.")

    # Calls each nested function so that their code will run everytime main() is called.
    enter_expenses()
    calculate_expenses()

main()