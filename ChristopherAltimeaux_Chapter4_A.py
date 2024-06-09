# A program that allows a user to input an email message and returns its "spam score" and likelihood of it being spam.

import time
# A decorator function that will calculate the time it takes a function to execute and return the wrapper.
def make_timer(func):
    # A wrapper function that tracks the time using the time.time() method before and after a function is called and
    # prints the difference.
    def wrapper(*args, **kwargs):
        t1  = time.time()
        ret_val = func(*args, **kwargs)
        t2 = time.time()
        print("Time elapsed was", t2 - t1)
        return ret_val
    return wrapper
# A function that will check email messages for spam.
@make_timer
def check_spam():
    # Initializes a list that contains 30 potential spam keywords and phrases.
    spam_words = [
        "Have you heard",
        "Take Action",
        "Free gift",
        "To ensure your spot",
        "Your Package has arrived",
        "Limited Time Offer",
        "We need to verify your account information",
        "Schedule your delivery",
        "Act now",
        "Special discount just for you",
        "You have been selected",
        "Lose weight fast",
        "50% OFF",
        "get rich quick",
        "change your password",
        "Claim it",
        "I am writing on behalf",
        "You have been chosen",
        "Make Money",
        "Special Promotion",
        "You don't want to miss",
        "Update My Payment Details",
        "You've got to see this",
        "Last Call",
        "This ends tonight",
        "ACTION REQUIRED",
        "Please read",
        "wire funds",
        "Lonely singles in your area",
        "20% off"
    ]
    # A counter that tracks how spam keywords are in the email.
    spam_score = 0

    # A set that holds the spam words that were detected in the email.
    detected_words = set()

    # Prompts the user to enter an email message.
    email_message = input("Please enter an email message to check for spam: ")

    # A for loop that will check if there are any spam keywords in the email message. Then will add each occurrence
    # to the spam_score and add the word to the set.
    for word in spam_words:
        if word.casefold() in email_message.casefold():
            spam_score += email_message.casefold().count(word.casefold())
            detected_words.add(word)

    # Creates a variable to track the likelihood of the message being spam based on the spam_score.
    likelihood = ""
    if spam_score <= 1:
        likelihood = "unlikely"
    elif spam_score == 2:
        likelihood = "likely"
    else:
        likelihood = "definitely"

# Outputs the scam score and the likelihood.
    print(f"This email has a spam score of {spam_score}. This message is {likelihood} spam. The words that raised suspicion are: {detected_words}")


check_spam()
