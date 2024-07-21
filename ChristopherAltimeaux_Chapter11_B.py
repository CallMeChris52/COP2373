# A program that determines the length of the hypotenuse of a right triangle given its nearest angle and length of
# the nearest side.

# Imports the cos and radians functions from the math class.
from math import cos, radians


# The main function that will be used to run the program.
def main():
    # Prompts the user to enter the nearest angle.
    nearest_angle = float(input("Enter the nearest angle of the right triangle in degrees: "))

    # Prompts the user to enter the length of the adjacent side.
    adjacent_side = float(input("Enter the length of the adjacent side of the right triangle: "))

    # A formula that will be used to calculate the hypotenuse of the triangle given the user's parameters.
    hypotenuse = adjacent_side / cos(radians(nearest_angle))

    # Prints the calculated hypotenuse using an f-string.
    print(f"The hypotenuse of the triangle is: {hypotenuse}")


# Calls the main function.
main()
