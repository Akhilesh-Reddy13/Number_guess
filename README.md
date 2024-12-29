# Number Guessing Game

This project idea is taken from roadmap.sh
Project URL:https://roadmap.sh/projects/number-guessing-game
Welcome to the Number Guessing Game! This is a simple command-line game where you have to guess a randomly generated number between 1 and 100. The game has three difficulty levels: Easy, Medium, and Hard, each with a different number of attempts to guess the correct number.

Requirements
JDK (version 17 or higher)

How to Run
Clone the Repository:

git clone https://github.com/Akhilesh-Reddy13/Number_guess.git

How to Play
Run the game by executing the Java file.
You will be presented with a prompt to select the difficulty level for the game.
Choose the difficulty level by entering 1 for Easy, 2 for Medium, or 3 for Hard.
Once you've selected the difficulty level, you will be prompted to enter your guess.
Enter a number between 1 and 100.
If your guess is incorrect, you will receive a hint indicating whether the correct number is higher or lower than your guess.
Keep guessing until you correctly guess the number or run out of attempts.
Difficulty Levels
Easy: 10 attempts to guess the correct number.
Medium: 5 attempts to guess the correct number.
Hard: 3 attempts to guess the correct number.

Sample Output
Welcome to Number Guessing game
Enter 1.Easy(10 chances) 2.Medium(5 chances) 3.Hard(3 chances)
1
You are given 10 chances to guess a number between(1-100)
Enter the number to guess:45
Wrong, the number is greater than 45
Chances left= 9
Enter the number to guess:0
Wrong, the number is greater than 0
Chances left= 8
Enter the number to guess:60
Wrong, the number is greater than 60
Chances left= 7
Enter the number to guess:80
Wrong, the number is greater than 80
Chances left= 6
Enter the number to guess:100
Wrong, the number is less than 100
Chances left= 5
Enter the number to guess:90
Wrong, the number is less than 90
Chances left= 4
Enter the number to guess:85
Wrong, the number is less than 85
Chances left= 3
Enter the number to guess:82
Wrong, the number is less than 82
Chances left= 2
Enter the number to guess:81
You've guessed it right in 9 guesses.Do you play again(Y/N): N

Additional Features (To Be Added)
Total Time Taken: Add a timer to see how long it takes the user to guess the number.
Hint System: Implement a hint system that provides clues to the user if they are stuck..
Score: Keep track of the user’s high score (i.e., the fewest number of attempts it took to guess the number under a specific difficulty level).
