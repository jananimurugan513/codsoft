import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int guessCount = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (userGuess != numberToGuess) {
            userGuess = scanner.nextInt();
            guessCount++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        scanner.close();
    }
}