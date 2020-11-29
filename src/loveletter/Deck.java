package loveletter;

import java.util.*;

/**
 * Representation of a deck. Cards may be drawn from deck. <p>
 * Initialised with the following cards: <ol>
 * <li> 5x Guard
 * <li> 2x Priest
 * <li> 2x Baron
 * <li> 2x Handmaid
 * <li> 2x Prince
 * <li> 1x King
 * <li> 1x Countess
 * <li> 1x Princess
 * </ol>
 * 
 * @author Jiemin Ai
 */
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
     * Sets a new full deck using hard coded literal, then shuffles
     */
    public void newDeck() {
        deck = new ArrayList<Card>(Arrays.asList(init_deck));
        try {
            deck = shuffle(deck);
        } catch(EmptyDeckException e) {}
    }

    /**
     * Removes a card from deck and returns it
     * i.e. A card has been drawn.
     * @throws EmptyDeckException
     */
    public Card drawCard() throws EmptyDeckException{
        if(deck.size() > 0) {
            return deck.remove(0);
        } else {
            throw new EmptyDeckException("Deck is Empty");
        }
        
    }

    /**
     * Shuffles an ArrayList of Cards. Length does not matter. <p>
     * @return the ArrayList
     */
    public static ArrayList<Card> shuffle(ArrayList<Card> deck) throws EmptyDeckException{
        if(deck.size() > 0) {
            Collections.shuffle(deck);
            return deck;
        } else {
            throw new EmptyDeckException("Deck is Empty");
        }
    }
}
