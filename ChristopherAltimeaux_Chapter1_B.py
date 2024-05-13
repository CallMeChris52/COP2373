# A program that recreates the Magic 8 Ball experience by printing a random response to a yes or no question.

# The function from this module will allow a random element from a sequence to be selected.
from random import choice


# A function that will create the 8ball_responses.txt file.
def create_file():
    # Uses a context manager to create and write all possible responses in the 8ball_responses.txt file.
    with open("8ball_responses.txt", "w") as responses:
        responses.write("Yes, of course!\n"
                        "Without a doubt, yes.\n"
                        "You can count on it.\n"
                        "For sure!\n"
                        "Ask me later!\n"
                        "I'm not sure.\n"
                        "I can't tell you right now.\n"
                        "I'll tell you after my nap.\n"
                        "No way!\n"
                        "I don't think so.\n"
                        "Without a doubt, no.\n"
                        "The answer is clearly NO!")


# A function that will accept a user's question and return a random response.
def ask_question():
    # Creates an empty list to hold all the possible responses from  8ball_responses.txt
    answers = []

    # Uses a context manager to open the 8ball_responses.txt file and store its contents in the answers list.
    with open("8ball_responses.txt", "r") as responses:
        for line in responses.readlines():
            answers.append(line)

        keep_playing = "Y"
        # Allows users to continually ask questions until they decide to stop playing.
        while keep_playing == "Y":
            question = input("The Magic 8 Ball knows all. What is your question? ")
            print(choice(answers))
            keep_playing = input("I have answered your question. Would you like to ask me another one? (Y/N) ")
            # Breaks the loop if the user no longer wants to play.
            if keep_playing.upper() == "N":
                print("The Magic 8 Ball has bestowed its infinite wisdom upon you. Now begone!")
                break


create_file()
ask_question()
