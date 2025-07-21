import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxAttempts = 10;
        int score = 0;
        boolean playAgain;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nI have generated a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry! You've used all your attempts. The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("\nThanks for playing!");
        System.out.println("Your final score (rounds won): " + score);

        sc.close();
    }
}
