import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String pStringChoice;
    String cStringChoice;
    
    System.out.println("-- RockPaperScissors --");
    System.out.print("\nEnter \n- 1 for Rock\n- 2 for Paper \n- 3 for Scissors\nChoice: ");
    int playerChoice = scan.nextInt();
    int computerChoice = (int)(Math.random()*3)+1;

    // Convert player choice to a String
    if (playerChoice == 1) {
      pStringChoice = "rock";
    }
    else if (playerChoice == 2) {
      pStringChoice = "paper";
    }
    else if (playerChoice == 3) {
      pStringChoice = "scissors";
    }
    else {
      pStringChoice = "invalid";
    }

    if (computerChoice == 1) {
      cStringChoice = "rock";
    }
    else if (computerChoice == 2) {
      cStringChoice = "paper";
    }
    else if (computerChoice == 3) {
      cStringChoice = "scissors";
    }
    else {
      cStringChoice = "invalid";
    }

    System.out.println("\nYou played: " + pStringChoice);
    System.out.println("The computer played: " + cStringChoice + "\n");
    boolean playerWon = ((playerChoice == 1 && computerChoice == 3) || (playerChoice == 2 && computerChoice == 1) || (playerChoice == 3 && computerChoice == 2));
    boolean tie = (playerChoice == computerChoice);
    boolean validChoice = (playerChoice >= 1 && playerChoice <= 3);
    System.out.println(validChoice);
    if (!validChoice) {
      System.out.println("Please enter a valid choice next time.");
    }
    else if (playerWon && !tie && validChoice) {
      System.out.println("You won, because the computer chose " + cStringChoice + ", and " + pStringChoice + " beats " + cStringChoice + "!");
    }

  else if (!playerWon && !tie && validChoice) {
    System.out.println("You lost, because the computer chose " + cStringChoice + ", and " + cStringChoice + " beats " + pStringChoice + "!");
  }
    else if (tie && validChoice) {
      System.out.println("It's a tie, because you chose " + pStringChoice + " and the computer chose " + cStringChoice + "!");
    }
    else {
      System.out.println("Please choose a valid choice.");
    }
    scan.close();
  }
}