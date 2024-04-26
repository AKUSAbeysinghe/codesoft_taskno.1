//TASK 01 - NUMBER GAME
//CODESOFT

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            System.out.println("Welcome to the Guess the Number game!");
            int randomNumber = (int) (Math.random() * 100) + 1; // Generate random number between 1 and 100
            int attempts = 0;
            final int maxAttempts = 5;

            while (attempts < maxAttempts) {
                System.out.print("Guess the number between 1 and 100: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + randomNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        }

        System.out.println("Thanks for playing!");
    }
}

