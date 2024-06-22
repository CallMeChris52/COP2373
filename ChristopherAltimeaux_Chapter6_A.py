# A program that allows users to enter a phone number, social security number and zip code and validates their format.

# Import the regular expression module.
import re


# A function that will validate any phone number passed in as a string.
def validate_phone_number(number):
    # A raw string that uses meta characters, character sets, and expression quantifiers to create a pattern that
    # most common phone numbers follow.
    phone_number_pattern = r"[(]*\d{3}[)]*[ .-]*\d{3}[ .-]*\d{4}$"

    # Uses the regular expression .match() method to create a match object. If the match object is created,
    # the function returns true.
    if re.match(phone_number_pattern, number):
        return True
    else:
        return False


# A function that will validate a social security number.
def validate_social_security(number):
    # A raw string that represents the most common social security patterns.
    social_security_pattern = r"\d{3}[ -]*\d{2}[ -]*\d{4}$"

    # Uses the regular expression .match() method to create a match object. If the match object is created,
    # the function returns true.
    if re.match(social_security_pattern, number):
        return True
    else:
        return False


# A function that will validate a zip code.
def validate_zip_code(number):
    # A raw string that represents the most common zip code formats.
    zip_code_pattern = r"\d{5}[ -]*(\d{4})*$"

    # Uses the regular expression .match() method to create a match object. If the match object is created,
    # the function returns true.
    if re.match(zip_code_pattern, number):
        return True
    else:
        return False


# The main function that will prompt the user to enter a series of numbers and call their respective function to
# validate their form.
def main():
    # Creates variables that will store the users' inputs.
    user_phone_number = input("Please enter a phone number: ")
    user_social_security = input("Please enter a social security number: ")
    user_zip_code = input("Please enter a zip code:")

    # A series of if/else blocks that will call the validation functions and return whether the user's number was
    # entered in the correct format.
    if validate_phone_number(user_phone_number):
        print("This phone number is valid.")
    else:
        print("This phone number is invalid.")

    if validate_social_security(user_social_security):
        print("This social security number is valid.")
    else:
        print("This social security number is invalid.")

    if validate_zip_code(user_zip_code):
        print("This zip code is valid.")
    else:
        print("This zip code is invalid.")

# Calls the main function to run the program.
main()