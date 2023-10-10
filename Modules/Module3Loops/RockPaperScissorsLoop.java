package Modules.Module3Loops;

import java.util.Scanner;

public class RockPaperScissorsLoop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String pStringChoice;
    String cStringChoice;
    int playAgain;
    int winCount = 0;
    int loseCount = 0;
    int tieCount = 0;
    
    System.out.println("-- RockPaperScissors --");
    do {
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
        else if (playerChoice == 36) {
            pStringChoice = "THE SECRET WEAPON";
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

        // **************************** //
        // USE 36 FOR THE SECRET WEAPON //
        // **************************** //

        
        System.out.println("\nYou played: " + pStringChoice);
        System.out.println("The computer played: " + cStringChoice + "\n");
        boolean playerWon = ((playerChoice == 1 && computerChoice == 3) || (playerChoice == 2 && computerChoice == 1) || (playerChoice == 3 && computerChoice == 2));
        boolean tie = (playerChoice == computerChoice);
        boolean validChoice = (playerChoice >= 1 && playerChoice <= 3);
        boolean secretWeaponUsed = (playerChoice == 36);
        if (!validChoice && playerChoice != 36) {
            System.out.println("Please enter a valid choice next time.");
        }
        else if ((playerWon && !tie) || secretWeaponUsed) {
            winCount++;
            System.out.println("You won, because the computer chose " + cStringChoice + ", and " + pStringChoice + " beats " + cStringChoice + "!");
        } else if (!playerWon && !tie) {
            loseCount++;
            System.out.println("You lost, because the computer choce " + cStringChoice + ", and " + cStringChoice + " beats " + pStringChoice + "!");
        } else if (tie) {
            tieCount++;
            System.out.println("It's a tie, because you chose " + pStringChoice + " and the computer chose " + cStringChoice + "!");
        } else {
            
        }
        System.out.print("Play again? (1 for yes, 2 for no): ");
        playAgain = scan.nextInt();
    } while (playAgain != 2);
    if (winCount == 1) System.out.println("You won " + winCount + " time.");
    else System.out.println("You won " + winCount + " times.");
    if (tieCount == 1) System.out.println("You tied " + tieCount + " time.");
    else System.out.println("You tied " + tieCount + " times");
    if (loseCount == 1) System.out.println("You lost " + loseCount + " time.");
    else System.out.println("You lost " + loseCount + " time.");

    scan.close();
  }
}