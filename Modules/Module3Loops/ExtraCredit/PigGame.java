package Modules.Module3Loops.ExtraCredit;

import java.util.Scanner;

public class PigGame {
    public static void clearScreen() {
        System.out.println("\033[H\033[2J"); // found from this https://stackoverflow.com/a/32295974 answer
        System.out.flush();
    }

    public static void main(String[] args) {
         clearScreen();

        int playerRollOne;
        int playerRollTwo;
        int playerRollSum;
        int playerTurnTotal = 0;
        int playerGameTotal = 0;

        int computerRollOne;
        int computerRollTwo;
        int computerRollSum;
        int computerTurnTotal = 0;
        int computerGameTotal = 0;

        boolean turnOver;
        boolean gameOver = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Pig!");
        System.out.println("The goal of the game is to be the first to get to 100.");
        System.out.println("You can roll the dice as many times as you want each turn until you get a one.");
        System.out.println("If you roll a one, then you lose your points for the turn and the computer gets the dice.");
        System.out.println("If you get snake eyes (two ones), then you lose all points that you earned in a game.");
        System.out.println("Type zero to hold and pass the dice to the computer to avoid getting a one or snake eyes.");
        do {
            do {
                System.out.print("\nHit enter to roll the dice, or enter 0 to turn over the dice. \n> ");
                String choice = scan.nextLine(); // I had to use a nextLine, since hitting enter with a nextInt just waits.

                if (choice.equals("0")) {turnOver = true; break;} // found from https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
                else {turnOver = false;}


                playerRollOne = (int)((Math.random()) * 6) + 1;
                playerRollTwo = (int)((Math.random()) * 6) + 1;
                playerRollSum = playerRollOne + playerRollTwo;
                playerTurnTotal = playerTurnTotal + playerRollSum;
                playerGameTotal = playerGameTotal + playerRollSum;
                clearScreen();

                if (playerRollOne == 1 || playerRollTwo == 1) { 
                    playerGameTotal  = playerGameTotal - playerTurnTotal;
                    playerTurnTotal = 0;
                    playerRollSum = 0;

                    System.out.println("You got a one, so you lose all points for this turn and have to turn over the dice.\n");
                    turnOver = true;
                }

                if (playerRollOne + playerRollTwo == 2) { 
                    playerGameTotal = 0;
                    playerTurnTotal = 0;
                    System.out.println("You rolled snake eyes, so you lose all points in the game and have to turn over the dice.\n");
                    turnOver = true;
                }

                if (playerGameTotal >= 100) { 
                    gameOver = true;
                    break;
                } else {
                    gameOver = false;
                }

                System.out.println("You rolled a " + playerRollOne + " and a " + playerRollTwo + ".");
                System.out.println("Total rolled this move: " + playerRollSum + ".");
                System.out.println("Total this turn: " + playerTurnTotal + "\n");
                System.out.println("Total this game: " + playerGameTotal + "\n\n");
            } while (!turnOver && !gameOver);

            

            playerTurnTotal = 0;
            System.out.println("\n-- COMPUTER'S TURN BEGINS --\n");

            do {
                turnOver = false;
                System.out.println("-- Computer's Turn --");
                System.out.println("Hit enter to forward the computer's turn one move.");
                scan.nextLine();
            

                computerRollOne = (int)((Math.random()) * 6) + 1;
                computerRollTwo = (int)((Math.random()) * 6) + 1;
                computerRollSum = computerRollOne + computerRollTwo;
                computerTurnTotal = computerTurnTotal + computerRollSum;
                computerGameTotal = computerGameTotal + computerRollSum;
                clearScreen();

                if (computerRollOne == 1 || computerRollTwo == 1) { 
                    computerTurnTotal = computerTurnTotal - computerTurnTotal; 
                    computerRollSum = 0;

                    System.out.println("The computer got a one, so it loses all points for this turn and has to turn over the dice.\n");
                    computerTurnTotal = 0;

                    break;
                }

                if (computerRollOne + computerRollTwo == 2) { 
                    computerGameTotal = 0;
                    computerTurnTotal = 0;
                    System.out.println("The computer rolled snake eyes, so it loses all points in the game and has to turn over the dice.\n");
                    turnOver = true;
                }

                if (computerGameTotal >= 100) {
                    gameOver = true;
                    break;
                }

                if (computerTurnTotal >= 20) {
                    turnOver = true;
                }

                System.out.println("Computer rolled a " + computerRollOne + " and a " + computerRollTwo + ".");
                System.out.println("Total rolled this move: " + computerRollSum + ".");
                System.out.println("Total this turn: " + computerTurnTotal + "\n");
                System.out.println("Total this game: " + computerGameTotal + "\n\n");

            } while (computerTurnTotal <= 20 && !turnOver);
            if (turnOver = true) {
                System.out.println("The computer has turned over the dice.\n");
            }

            computerTurnTotal = 0;
            System.out.println("\n-- PLAYER'S TURN BEGINS --");
        } while(!gameOver);
        if (playerGameTotal >= 100) {
            System.out.println("Congrats! You won!");
        } else {
            System.out.println("You lost to the computer.");
        }
    }
}
