package LevelTwoConditionalPrograms;

import java.util.*;

// Guessing Game
public class GuessingGame {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("-- Guessing Game --");
    int answer = (int)(Math.random()*10 + 1);
    // System.out.println(answer);
    System.out.print("\nGuess a number 1-10: ");

    int guess = scan.nextInt();
    if (guess==answer) {
      System.out.println("You got it right!");
    }
    else if (guess<answer) {
      System.out.println("Too low!");
    }
    else {
      System.out.println("Too high!");
    }
    scan.close();
  }
}