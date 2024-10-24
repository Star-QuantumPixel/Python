import random
option =["rock","paper","scissors"]
computer_choice =random.choice(option)

user_input=input("make a choice \nrock\npaper\nscissors\n ")
print("Computer choice = ",computer_choice)
if computer_choice == user_input:
    print("It's a tie!")
elif computer_choice == "rock" and user_input == "paper":
    print("You win!")
elif computer_choice == "rock" and user_input== "scissors":
    print("You lose!")
elif computer_choice == "paper" and user_input == "rock":
    print("You lose!")
elif computer_choice == "paper" and user_input == "scissors":
    print("You win!")
elif computer_choice == "scissors" and user_input== "paper":
    print("You lose!")
elif computer_choice == "scissors" and user_input == "rock":
    print("You win!")
else:
    print("lets play again!")