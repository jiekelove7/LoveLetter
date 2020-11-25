package loveletter;

/**
 * Class to represent instances of a card. <p>
 * Cards form a deck and are the basic pieces used to play the game
 */
public class Card {
    
    // CardType of the Card
    private CardType type; 

    /**
     * Constructor
     * @param type of the card
     */
    public Card(CardType type) {
        this.type = type;
    }

    /**
     * @return the type of the card
     */
    public CardType getType() {
        return type;
    }

    /**
     * @return the strength value of the card
     */
    public int getValue() {
        return type.getValue();
    }

}
