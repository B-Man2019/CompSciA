import java.util.Scanner;

public class GuessingGameLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-- GuessingGame --");
        int answer = (int)(Math.random()*100 + 1);
        int guess;
        int playAgain;
        int index = 0;
        System.out.println("Guess a number 1-100. Type -5 to quit.");
        do {
            do {
                System.out.print("Guess: ");
                guess = scan.nextInt();
                boolean validGuess = (guess >= 1 && guess <= 100);

                if (validGuess) {
                    index++;
                }

                if (guess == -5) {
                    break;
                }
                if (guess == answer) {
                    if (index == 1) {
                        System.out.println("You won in " + index + " guess! You are amazing!");
                    } else {
                        System.out.println("You won in " + index + " guesses!");
                    }
                } else if (guess < answer && validGuess) {
                    System.out.println("Your guess is too low.");
                } else if (guess > answer && validGuess) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Invalid guess.");
                }
            } while (guess != answer);

            if (guess == -5) {
                break;
            }

            System.out.print("\nPlay again? (1 for yes, 2 for no): ");
            playAgain = scan.nextInt();
        } while (playAgain == 1);
        scan.close();
    }
}
