# A program that pre-sells tickets and allows users to buy 4 at a time with a maximum between buyers of 20. After all
# tickets have been sold, the program will display the numbers of buyers.

# Defining a function to store the program.
def main():
    # Initializing constants and variables to hold the total tickets, limit per buyer and number of buyers after each
    # transaction respectively.
    TOTALTICKETS = 20
    MAXPERBUYER = 4
    numOfBuyers = 0

    #A while loop that will continue to iterate until there are no tickets left.
    while TOTALTICKETS > 0:
        numOfTickets = int(input(f"There are {TOTALTICKETS} tickets left. How many tickets would you like to buy? "))
        # Ensures no more than 4 tickets are bought.
        if numOfTickets > 4:
            print("4 is the maximum number of tickets per customer. Please enter a number less than 4.")
        # Ensures a valid number is entered.
        elif numOfTickets <= 0:
            print("Invalid number. Please enter a value greater than 0.")
        #Ensures users cannot buy more tickets than are available.
        elif numOfTickets > TOTALTICKETS:
            print(
                f"There are only {TOTALTICKETS} tickets left. Please enter a value less than or equal to {TOTALTICKETS}.")
        #Deducts the number of tickets from total and increment buyers each time.
        else:
            TOTALTICKETS -= numOfTickets
            numOfBuyers += 1
    #Outputs the number of buyers after all tickets have been sold.
    print(f"There are {numOfBuyers} buyers.")


main()
