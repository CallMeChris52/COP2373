# A program that pre-sells tickets and allows users to buy 4 at a time with a maximum between buyers of 20. After all
# tickets have been sold, the program will display the numbers of buyers.

# Defining a function to store the program.
def main():
    # Initializing constants and variables to hold the total tickets, limit per buyer and number of buyers after each
    # transaction respectively.
    TOTAL_TICKETS = 20
    MAX_PER_BUYER = 4
    num_of_buyers = 0

    #A while loop that will continue to iterate until there are no tickets left.
    while TOTAL_TICKETS > 0:
        num_of_tickets = int(input(f"There are {TOTAL_TICKETS} tickets left. How many tickets would you like to buy? "))
        # Ensures no more than 4 tickets are bought.
        if num_of_tickets > MAX_PER_BUYER:
            print("4 is the maximum number of tickets per customer. Please enter a number less than 4.")
        # Ensures a valid number is entered.
        elif num_of_tickets <= 0:
            print("Invalid number. Please enter a value greater than 0.")
        #Ensures users cannot buy more tickets than are available.
        elif num_of_tickets > TOTAL_TICKETS:
            print(
                f"There are only {TOTAL_TICKETS} tickets left. Please enter a value less than or equal to {TOTAL_TICKETS}.")
        #Deducts the number of tickets from total and increment buyers each time.
        else:
            TOTAL_TICKETS -= num_of_tickets
            num_of_buyers += 1
    #Outputs the number of buyers after all tickets have been sold.
    print(f"There are {num_of_buyers} buyers.")


main()
