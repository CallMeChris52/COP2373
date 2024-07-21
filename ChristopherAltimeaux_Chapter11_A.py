# A program that simulates a Poker game and allows the user to draw five cards. After the users receives their cards,
# they are allowed to replace any cards in their hand during the draw phase.
import random
import re


# A class that will allow the creation of Deck objects that will have methods to deal and replace cards.
class Deck:
    # A __init__ magic method that will create the self.card_list and self.hand instance variables and shuffle the
    # cards by calling the random.shuffle method.
    def __init__(self):
        # A list comprehension that fills the list with a card from each suit and value from a standard deck.
        self.card_list = [num + suit
                          for suit in "\u2665\u2666\u2663\u2660"
                          for num in "A23456789TJQK"
                          ]
        # Calls the random.shuffle() method from the random module to shuffle the cards.
        random.shuffle(self.card_list)
        self.hand = []

    # A method that will deal 5 cards to the player's hand and display the hand to the user.
    def deal(self):
        # A for loop that remove cards from the card_list and add them to the player's hand.
        for card in range(5):
            new_card = self.card_list.pop()
            self.hand.append(new_card)
        print(f"Welcome to Poker! Here is your hand: {self.hand}")

    # A method that replaces the cards that the user would like to change.
    def replace_cards(self, cards):
        for card in cards:
            new_card = self.card_list.pop()
            # Uses [] notation to directly change a specific card in the player's hand.
            self.hand[int(card) - 1] = new_card

        print(f"Here is your new hand: {self.hand}")


# The main function that will provide the player their hand and the option to replace any cards.
def main():
    # Creates a Deck object.
    d1 = Deck()

    # Calls the Deck object's .deal() method to deal the player their cards.
    d1.deal()

    # A regular expression pattern that will be used to determine which cards the player would like to replace.
    pattern = r"[1-5]"

    # Provides the player a list of their hand and asks if they would like to change any cards.
    user_input = input(
        "Would you like to change any of your cards? Please enter a series of numbers 1-5 to select which card("
        "s) you would like to replace. (If there are none, then press Enter to continue.")

    # Calls the re.findall() method to store the user's input into a list.
    cards_to_replace = re.findall(pattern, user_input)

    # An if statement that replaces the player's selected cards if they decided to change any of them.
    if len(cards_to_replace) > 0:
        d1.replace_cards(cards_to_replace)


# Calls the main() function.
main()
