package Module3Loops;

import java.util.Scanner;

public class CrazyDiceLoop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean tie;
    int money = 100;
    int amountBet;
    int playAgain;
    boolean validAmountBet;
    int timesWon = 0;
    int timesLost = 0;

    System.out.println("-- CrazyDice --");
    do {
      System.out.println("You have " + money + " dollars to bet. How much would you like to bet on this game? If you lose all your money, you are kicked out.");
      System.out.print("> ");
      amountBet = scan.nextInt();
      validAmountBet = amountBet <= money;
      if (!validAmountBet) {
        System.out.println("Please bet a valid amount.");
      }
    } while (!validAmountBet);

    scan.nextLine();
    
    do {
      System.out.println("Press enter/return to roll the dice. ");
      scan.nextLine();

      int firstRoll = (int)((Math.random()) * 6) + 1;

      System.out.println("First dice rolled. You got: " + firstRoll);
      System.out.println("Press enter to roll again");
      scan.nextLine();

      int secondRoll = (int)((Math.random()) * 6) + 1;

      System.out.println("Second dice rolled. You got: " + secondRoll);
      int sum = firstRoll + secondRoll;

      System.out.println("\nThe sum of your dice is: " + sum);

      if (sum == 2 || sum == 3 || sum == 12) {
        System.out.println("You lost, because your sum was " + sum + "!");
        money = money - amountBet;
      }

      else if (sum == 11 || sum == 7) {
        money = money + amountBet;
        System.out.println("You won, because your sum was " + sum + "!");
      }

      else {
          int oldSum = sum;
          do {
            System.out.println("You tied. Roll again!");
              System.out.println("Press enter/return to roll the dice. ");
              scan.nextLine();

              firstRoll = (int)((Math.random()) * 6) + 1;
              
              System.out.println("First dice rolled. You got: " + firstRoll);
              System.out.println("Press enter to roll again");

              scan.nextLine();

              secondRoll = (int)((Math.random()) * 6) + 1;

              System.out.println("Second dice rolled. You got: " + secondRoll);

              sum = firstRoll + secondRoll;

              System.out.println("\nThe sum of your dice is: " + sum);
              tie = (!(sum == oldSum) || (sum == 7));
              if (sum == oldSum) {
                  System.out.println("You win, because your current sum, " + sum + ", is equal to the previous sum, " + oldSum + "!");
                  money = money + amountBet;
                  timesWon++;
                  break;
              }
              else if (sum == 7) {
                  System.out.println("You lose, because your sum (" + sum + ") = 7!");
                  money = money - amountBet;
                  timesLost++;
                  break;
              }
              else {
                  System.out.println("Your sum is " + sum + ".");
              }
          } while (tie);

      }
      System.out.println("Play again? (1 for yes, 2 for no): ");
      System.out.print("\n> ");
      playAgain = scan.nextInt();
      scan.nextLine();
      if (money <= 0) {
        System.out.println("You lost all your money! You're out!");
        break;
      }
      if (playAgain == 1) {
        do {
          System.out.println("You have " + money + " dollars to bet. How much would you like to bet on this game? If you lose all your money, you are kicked out.");
          System.out.print("\n> ");
          amountBet = scan.nextInt();
          validAmountBet = amountBet <= money;
          if (!validAmountBet) {
            System.out.println("Please bet a valid amount.");
          }
        } while (!validAmountBet);

      }
    } while (playAgain != 2);

    System.out.println("You ended the game with " + money + " dollars.");
    System.out.println("You won: " + timesWon + " times.");
    System.out.println("You lost: " + timesLost + " times.");
    scan.close();
  }
}