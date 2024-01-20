import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 99;
        int maxAttempts = 9;
        int score = 0;

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("You are Welcome to the Number Guessing Game");
            System.out.println(
                    "I have selected a number between " + minRange + " and " + maxRange + " Try to Guess the Number");

            int attempts = 0;
            while (attempts < maxAttempts) {
                System.out.print("Enter your Guessed Number: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < targetNumber) {
                    System.out.println("Too low guessed! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high guessed! Try again.");
                } else {
                    System.out.println(
                            "Felicitations! You guessed the correct number " + targetNumber + "  in " + attempts);
                    score += maxAttempts - attempts + 1;
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry. You have reached the maximum number of attempts. The correct number is: "
                        + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }

        System.out.println("Thanks for playing! Your total score is: " + score);
    }
}
