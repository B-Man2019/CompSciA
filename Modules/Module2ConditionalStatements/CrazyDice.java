import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("-- CrazyDice --");
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
    }
    else if (sum == 11 || sum == 7) {
      System.out.println("You won, because your sum was " + sum + "!");
    }
    else {
      System.out.println("Roll again!");
      System.out.println("Press enter/return to roll the dice. ");
      scan.nextLine();
      firstRoll = (int)((Math.random()) * 6) + 1;
      System.out.println("First dice rolled. You got: " + firstRoll);
      System.out.println("Press enter to roll again");
      scan.nextLine();
      secondRoll = (int)((Math.random()) * 6) + 1;
      System.out.println("Second dice rolled. You got: " + secondRoll);
      int oldSum = sum;
      sum = firstRoll + secondRoll;
      System.out.println("\nThe sum of your dice is: " + sum);
      if (sum == oldSum) {
        System.out.println("You win, because your current sum, " + sum + ", is equal to the previous sum, " + oldSum + "!");
      }
      else if (sum == 7) {
        System.out.println("You lose, because your sum (" + sum + ") = 7!");
      }
      else {
        System.out.println("It's a tie!");
      }
    }
    scan.close();
  }
}