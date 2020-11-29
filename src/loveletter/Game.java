package loveletter;

import java.util.*;

/**
 * An instance of a game of Love Letter.
 */
public class Game {

    // Per game, a colour wins
    private Colour winner;
    public boolean gameOver;
    // The current turn of the game
    private Colour turn;

    private Deck deck;

    // The four players for a full game
    private Player p1;
    private Player p2;
    private Player p3;
    private Player p4;
    // Discard piles used for tallying up points
    private ArrayList<Card> p1_discard;
    private ArrayList<Card> p2_discard;
    private ArrayList<Card> p3_discard;
    private ArrayList<Card> p4_discard;


    /**
     * Constructor to create a new game
     * @param c1 reserved for Alpha
     * @param c2 reserved for Bravo
     * @param c3 reserved for Charlie
     * @param c4 reserved for Delta
     */
    public Game(Colour c1, Colour c2, Colour c3, Colour c4) {
        p1 = new Player(c1);
        p2 = new Player(c2);
        p3 = new Player(c3);
        p4 = new Player(c4);

        p1_discard = new ArrayList<Card>();
        p2_discard = new ArrayList<Card>();
        p3_discard = new ArrayList<Card>();
        p4_discard = new ArrayList<Card>();

        deck = new Deck();
        // Initial draw card
        drawCard(p1, true);
        drawCard(p2, true);
        drawCard(p3, true);
        drawCard(p4, true);
        
    }

    /**
     * Draw a card from the deck
     * @param player the player who draws a card
     * @param start true only if at the start of the game
     * @return The card drawn
     */
    public Card drawCard(Player player, boolean start) {
        try {
            Card drawn = deck.drawCard();
            if(start) {
                player.setHand(drawn);
            } else {
                player.setNew(drawn);
            }
            return drawn;
        } catch(EmptyDeckException e) {
            return null;
        }
    }

    public void playCard(Player player, Player target, CardType card) {
        //
        switch(card) {
            case GUARD:
            case PRIEST:
            case BARON:
            case HANDMAID:  
            case PRINCE:
            case KING:
            case COUNTESS:
            default:
        } 
        //

    }
}
