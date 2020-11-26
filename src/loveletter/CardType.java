package loveletter;

/**
 * Enumeration class to depict each individual card
 * 
 * @author Jiemin Ai
 */
public enum CardType {
    GUARD(1),
    PRIEST(2),
    BARON(3),
    HANDMAID(4),
    PRINCE(5),
    KING(6),
    COUNTESS(7),
    PRINCESS(8);

    // Strength of the card
    private final int value;

    /**
     * Initialises strength values to each card type.
     * @param value the strength of the card
     */
    private CardType(int value) {
        this.value = value;
    }
    
    /**
     * @return the strength value of the card
     */
    public int getValue() {
        return value;
    }
}
