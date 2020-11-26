package loveletter;

import java.util.*;

public class Deck {

    private static final Card[] init_deck = {
        new Card(CardType.GUARD), new Card(CardType.GUARD), new Card(CardType.GUARD),
        new Card(CardType.GUARD), new Card(CardType.GUARD),
        new Card(CardType.PRIEST), new Card(CardType.PRIEST),
        new Card(CardType.BARON), new Card(CardType.BARON),
        new Card(CardType.HANDMAID), new Card(CardType.HANDMAID),
        new Card(CardType.PRINCE), new Card(CardType.PRINCE),
        new Card(CardType.KING),
        new Card(CardType.COUNTESS),
        new Card(CardType.PRINCESS),
    };

    private ArrayList<Card> deck;

    /**
     * Constructor to create new deck
     */
    public Deck() {
        newDeck();
    }
    
    public ArrayList<Card> getDeck() {
        return deck;
    }

    /**
     * Overides current deck
     * @param deck to be overidden with
     */
    public void setDeck(ArrayList<Card> newdeck) {
        this.deck = newdeck;
    }

    /**
     * Sets a new deck using hard coded literal, then shuffles
     */
    public void newDeck() {
        deck = new ArrayList<Card>(Arrays.asList(init_deck));
        deck = shuffle(deck);
    }

    /**
     * Shuffles an ArrayList of Cards. Length does not matter. <p>
     * @return the ArrayList
     */
    public static ArrayList<Card> shuffle(ArrayList<Card> deck) {
        Collections.shuffle(deck);
        return deck;
    }
}
