package Sem1FinalExam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DeckOfCards deck = null; // set deck to null until the user creates it - MUST HANDLE NullPointerException
        DeckOfCards userCards = new DeckOfCards(0); // create a user deck with 0 cards

        String menu = "1. Create a deck of cards\n" + 
                    "2. Shuffle the deck\n" +
                    "3. Deal every card remaining\n" +
                    "4. Deal specific number of card\n" +
                    "5. Print how many cards are left in the deck\n" +
                    "6. Quit";

        int choice = 0;

        do { 
            System.out.println(menu);
            System.out.print("\n> ");
            try {
                choice = scan.nextInt();
            } catch (InputMismatchException e) {
                choice = -1;
                scan.nextLine(); // consume last nextInt
            }

            try {
                switch (choice) {
                    case 1:
                        deck = new DeckOfCards();
                        break;

                    case 2:
                        deck.shuffle();
                        System.out.println(deck);
                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:
                        System.out.println("The deck currently has " + deck.deckSize() + " cards.");
                        break;

                    case 6:

                        break;
                    
                    default:
                        System.out.println("Please enter a valid choice.");
                        break;
                }
            } catch (NullPointerException e) {
                System.out.println("Please create the deck first!");
            }
            
        } while (choice != 6);
        
        scan.close();
    }
}

