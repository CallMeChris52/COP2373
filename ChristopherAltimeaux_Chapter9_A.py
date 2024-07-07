# A program that creates bank account class that will allow users to withdraw and deposit money, return the interest
# rate, and display the balance.

# A class that will allow the instantiation of the BankAcct objects with the appropriate methods.
class BankAcct:
    # A __init__ magic method that creates the instance variables each time an object is instantiated.
    def __init__(self, name, account_number, balance, interest_rate):
        self.name = name
        self.account_number = account_number
        self.balance = balance
        self.interest_rate = interest_rate

    # A method that will change the interest rate.
    def set_interest_rate(self, new_rate):
        self.interest_rate = new_rate

    # A method that will withdraw money from the amount and display the remaining balance.
    def withdraw_money(self, amount):
        # An if/else that prevents users from overdrafting money that is not available in the account.
        if amount <= self.balance:
            self.balance -= amount
            print(f"You have successfully withdrawn ${amount:.2f}. Your current balance in now ${self.balance:.2f}.")
        else:
            print(f"You do not have the sufficient funds to withdraw ${amount:.2f}."
                  f" Your current balance is ${self.balance:.2f}.")

    # A method that will deposit money to the account and display the remaining amount.
    def deposit_money(self, amount):
        self.balance += amount
        print(f"You have successfully deposited ${amount:.2f}. Your current balance in now ${self.balance:.2f}.")

    # A method that calculates the total interest accrued after a certain number of days has passed.
    def calculate_interest_amount(self, days):
        interest_per_day = (self.balance * self.interest_rate) / 365
        interest_amount = interest_per_day * days
        print(f"The amount of interest accrued after {days} days is ${interest_amount:.2f}.")

    # A __str__ magic method that will display the bank account's name, account number, balance, and interest rate
    # when a BankAcct object is printed.
    def __str__(self):
        return ("Name: {}\n"
                "Account Number: {}"
                "\nBalance: ${:.2f}"
                "\nInterest Rate: {:.2f}%").format(
            self.name, self.account_number, float(self.balance), float(self.interest_rate * 100)
        )


# A function that will be used to test the BankAcct class by creating an object and calling its various methods.
def test_BankAcct():

    # Creates a bank account object using the BankAcct class.
    b1 = BankAcct("Christopher Altimeaux", 24588442545, 1000, 0.07)

    # Prints the information provided by the __str__ magic method of the class.
    print(b1)

    # Withdraws money from the account.
    b1.withdraw_money(50)

    # Attempts to withdraw more money than is in the account.
    b1.withdraw_money(1000)

    # Deposits money into the account.
    b1.deposit_money(100)

    # Calculates the interest accrued after 120 days.
    b1.calculate_interest_amount(120)

    # Changes the interest rate to 10%
    b1.set_interest_rate(0.10)

    # Calculates the interest accrued after 120 days again to show the different interest rate.
    b1.calculate_interest_amount(120)


test_BankAcct()
