package loveletter;

/**
 * Representation of a player who has access to their hand and the card they just drew
 */
public class Player {
    
    private Card hand;

    private Card drew;

    private Colour colour;

    public Player(Colour colour) {
        this.colour = colour;
    }

    /**
     * Changes around their hand as if they played a card.
     * 0: Played hand, 1: Played new card <p>
     * Returns null instead of exception if incorrect number is inputted
     * @return The card they played
     */
    public Card playCard(int choice) {
        if(choice == 0) {
            Card temp = hand;
            hand = drew;
            drew = null;
            return temp;
        } else if(choice == 1) {
            Card temp = drew;
            drew = null;
            return temp;
        } else { // In the event they inputted an incorrect number
            return null;
        }
    }

    /**
     * @return The card they had in their hand
     */
    public Card getHand() {
        return hand;
    }

    /**
     * @return The card they recently drew
     */
    public Card getNew() {
        return drew;
    }

    /**
     * @return The colour the player is
     */
    public Colour getColour() {
        return colour;
    }
}
