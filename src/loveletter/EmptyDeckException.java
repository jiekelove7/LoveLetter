package loveletter;

/**
 * Exception thrown when deck is to be manipulated but deck is empty
 */
@SuppressWarnings("serial")
public class EmptyDeckException extends Exception {
    public EmptyDeckException(String message) {
        super(message);
    }
}
