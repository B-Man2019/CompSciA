package Sem1FinalExam;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DeckOfCards deck = null; // set deck to null until the user creates it - MUST HANDLE NullPointerException
        // since if the user tries to execute methods of the deck class, it will throw a runtime exception


        String menu = """
                1. Create a deck of cards
                2. Shuffle the deck
                3. Deal every card remaining
                4. Deal specific number of card
                5. Print how many cards are left in the deck
                6. Quit""";

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
                        if (deck.deckSize() == 0) {
                            System.out.println("The deck is empty. Please create a new one.");
                            break;
                        }

                        while (deck.deckSize() > 0) {
                            System.out.println(deck.getCard(0));
                            deck.removeCard(0);
                        }
                        break;

                    case 4:
                        System.out.print("How many cards do you want to deal?\n> ");
                        int num = scan.nextInt();

                        if (num > deck.deckSize()) {
                            System.out.println("You tried to deal too many cards.");
                            break;
                        }

                        for (int i = 0; i < num; i++) {
                            System.out.println(deck.getCard(0));
                            deck.removeCard(0);
                        }
                        break;

                    case 5:
                        System.out.println("The deck currently has " + deck.deckSize() + " cards.");
                        break;

                    case 6:
                        // do nothing, just set choice to 6
                        // do while loop takes care of quitting
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

