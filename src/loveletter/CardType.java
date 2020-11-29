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

    /**
     * Player picks a target then guesses a card (Not a GUARD). Player is eliminated 
     * if correct card is guessed.
     * @return true if player is successfully eliminated.
     */
    public static boolean GUARD(Player player, Player target, CardType chosen) {
        return false;
    }

    /**
     * Player picks a target to see their card.
     * @return The type of the card
     */
    public static CardType PRIEST(Player player, Player target) {
        return null;
    }

    /**
     * Player picks a target to compare hands, lowest value is out.
     * @return The card of the target player, regardless if won or lost
     */
    public static CardType BARON(Player player, Player target) {
        return null;
    }

    /**
     * Grants immunity for one round.
     */
    public static void HANDMAID(Player player) {

    }

    /**
     * Picks a target player to discard a card. Princess causes elimination.
     */
    public static void PRINCE(Player player, Player target) {

    }

    /**
     * Picks a target player to trade hands
     */
    public static void KING() {

    }

    /**
     * If in hand with KING/PRINCE, must be played for no effect.
     */
    public static void COUNTESS() {

    }

    /**
     * If played, lose the game.
     */
    public static void PRINCESS(Player player) {
        player.eliminated = true;
    }
}