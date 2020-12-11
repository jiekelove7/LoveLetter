package loveletter;

/**
 * Representation of a player who has access to their hand and the card they just drew
 */
public class Player {
    
    private static final int CARD_HAND = 0;
    private static final int CARD_DRAWN = 1;
    // The card in hand
    private Card hand;
    // The card drawn at start of turn
    private Card drew;

    private Colour colour;
    // handmaid protection
    public boolean handmaid;
    // Is the player eliminated?
    public boolean eliminated;

    public Player(Colour colour) {
        this.colour = colour;
        handmaid = false;
    }

    /**
     * Changes around their hand as if they played a card.
     * 0: Played hand, 1: Played new card <p>
     * Returns null instead of exception if incorrect number is inputted
     * @return The card they played
     */
    public Card playCard(int choice) {
        if(choice == CARD_HAND) {
            Card temp = hand;
            hand = drew;
            drew = null;
            return temp;
        } else if(choice == CARD_DRAWN) {
            Card temp = drew;
            drew = null;
            return temp;
        } else { // In the event they inputted an incorrect number
            return null;
        }
    }

    /**
     * Alias for playCard strictly for their 'hand' card.
     * @return Card discarded
     */
    public Card discard() {
        return playCard(CARD_HAND);
    }

    /**
     * @return The card they had in their hand
     */
    public Card getHand() {
        return hand;
    }

    public void setHand(Card hand) {
        this.hand = hand;
    }

    /**
     * Used when card is drawn
     */
    public void setNew(Card drew) {
        this.drew = drew;
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
