# A program that recreates the Magic 8 Ball experience by printing a random response to a yes or no question.

#A function that will create the 8ball_responses.txt file.
def create_file():
    # Uses a context manager to create and write all possible responses in the 8ball_responses file.
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


def