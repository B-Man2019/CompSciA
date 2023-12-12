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

    public DeckOfCards(int num) {
        for (int i = 0; i <= num; i++) {

        }
    }

    // *************************
    // This algorithm randomly
    // selects a card to swap
    // with another random card
    // *************************
    public void shuffle() {
        for (int i = 0; i < deck.size() - 1; i++) {
            int rand1 = (int)((Math.random()) * (deck.size()));
            int rand2 = (int)((Math.random()) * (deck.size()));

            Card temp = deck.get(rand1);
            deck.set(rand1, deck.get(rand2));
            deck.set(rand2, temp);
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


    public String toString() {
        String str = new String();
        for (Card card : deck) {
            str += card + "\n";
        }
        return str;
    }
}
