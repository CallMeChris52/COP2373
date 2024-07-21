# A program that creates the Money class that allows the instantiation of Money objects.

# Imports the Decimal class from the decimal module.
from decimal import Decimal


# Defines the Money class that will inherit from the Decimal class.
class Money(Decimal):
    # A __new__ magic method that will handle the Decimal part of the Money class.
    def __new__(cls, v, units="USD"):
        return super(Money, cls).__new__(cls, v)

    # A __init__ magic method that creates the units instance variable.
    def __init__(self, v, units="USD"):
        self.v = v
        self.units = units


# A function that will test the Money class' addition, multiplication and subtraction operations.
def test_Money():
    # Creates two Money objects.
    m1 = Money("4.89", "USD")
    m2 = Money("5.25", "USD")

    # Adds two money object and displays the total.
    print(f"{m1} {m1.units} + {m2} {m2.units} is equal to {m1 + m2} {m1.units}")

    # Multiplies a Money object by a constant.
    print(f"{m2} {m2.units} * 5 is equal to {m2 * 5} {m2.units}")

    # Subtracts two Money objects.
    print(f"{m2} {m2.units} - {m1} {m2.units} is equal to {m2 - m1} {m2.units}")


# Calls the test_Money function.
# test_Money()
