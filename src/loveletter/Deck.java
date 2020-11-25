package loveletter;

import java.util.*;

public class Deck {

    private ArrayList<Card> deck;

    /**
     * Constructor to create new deck
     */
    public Deck() {
        deck = new ArrayList<Card>();

    }
    
    public ArrayList<Card> getDeck() {
        return deck;
    }
}
