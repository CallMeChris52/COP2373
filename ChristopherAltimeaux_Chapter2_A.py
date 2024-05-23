# A program that allows a user to input an email message and returns its "spam score" and likelihood of it being spam.

# A function that will check email messages for spam.
def check_spam():
    # Initializes a list that contains 30 potential spam keywords and phrases.
    spam_words = [
        "Click here",
        "Take Action",
        "Dear Client",
        "Dear Customer",
        "Your Package has arrived",
        "Limited Time Offer",
        "We need to verify your account information",
        "Schedule your delivery",
        "Act now",
        "Special Promotion",
        "You have been selected",
        "Won",
        "Prize",
        "Hi",
        "change your password",
        "Claim it",
        "I am writing on behalf",
        "Urgent",
        "Make Money",
        "Special Promotion",
        "Act now",
        "Update My Payment Details",
        "You've got to see this",
        "Congratulations",
        "Hurry",
        "ACTION REQUIRED",
        "Please read",
        "wire funds",
        "Win",
        "Alert"
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
