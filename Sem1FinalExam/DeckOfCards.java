package Sem1FinalExam;

import java.util.ArrayList;

public class DeckOfCards {
    ArrayList<Card> deck = new ArrayList<Card>();

    public DeckOfCards() {
        for (Suits suit: Suits.values()) { // .values creates an array of the enums
            for (Faces face: Faces.values()) {
                deck.add(new Card(suit, face));
            }
        }
    }

    public DeckOfCards(boolean empty) {
        // leave empty, just create an empty ArrayList
    }

    // *****************************
    // this shuffle method iterates
    // through each card in the
    // deck and swaps it with
    // another random card
    // *****************************
    public void shuffle() {
        for (int i = 0; i < deck.size() - 1; i++) {
                int rand = (int)((Math.random()) * (deck.size()));

                Card temp = deck.get(i);
                deck.set(i, deck.get(rand));
                deck.set(rand, temp);
        }
    }

    public int deckSize() {
        int len = 0;

        for (int i = 0; i < deck.size(); i++) {
            len++;
        }
        return len;
    }

    public void addCard(Suits suit, Faces face) {
        deck.add(new Card(suit, face));
    }

    public Card getCard(int index) {
        return deck.get(index);
    }

    public void removeCard(int index) {
        deck.remove(index);
    }



    public String toString() {
        String str = "";
        for (Card card : deck) {
            str += card + "\n";
        }
        return str;
    }
}
