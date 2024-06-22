# A program that will allow a user to enter any number of sentences. It will then display the sentences and their
# quantity.

# Import the regular expression module.
import re

# A main function that will be used to run the program.
def main():
    # A variable that stores the pattern as a raw string that will be used to verify each sentence.
    pat = r"[A-Z\d].*?[.!?](?= [A-Z\d]|$)"

    # Prompts the user to enter sentences and stores their input in a variable.
    user_sentences = input("Enter as many sentences as you would like. Please use proper grammar and punctuation: ")

    # Uses the regular expression .findall() method to create a list that will hold each sentence.
    sentences = re.findall(pat, user_sentences, flags= re.DOTALL | re.MULTILINE)

    # Prints the number of sentences.
    print(f"Number of sentences: {len(sentences)}")

    # A for loop that will print each sentence on a new line.
    for sentence in sentences:
        print("->", sentence)

# Calls the main() function to run the program.
main()