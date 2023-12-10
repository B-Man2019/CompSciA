package Sem1FinalExam;

import java.util.ArrayList;

public class DeckOfCards {
    ArrayList<Card> Deck = new ArrayList<Card>();

    public DeckOfCards() {
        for (Suits suit: Suits.values()) { // .values creates an array of the enums
            for (Faces face: Faces.values()) {
                Deck.add(new Card(suit, face));
            }
        }
        System.out.println(toString());
    }

    // *************************
    // This algorithm randomly
    // selects a card to swap
    // with another random card
    // *************************
    public void shuffle() {
        for (int i = 0; i < 75; i++) {
            int rand1 = (int)((Math.random()) * Deck.size() - 1) + 1;
            int rand2 = (int)((Math.random()) * Deck.size() - 1) + 1;

            Card temp = Deck.get(rand1);
            Deck.set(rand1, Deck.get(rand2));
            Deck.set(rand2, temp);
        }
        System.out.println(toString());
    }

    public String toString() {
        String str = new String();
        for (Card card : Deck) {
            str += card + "\n";
        }

        return str;
    }
}
