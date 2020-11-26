package loveletter.agents;

import loveletter.*;
import java.util.*;

public class RandomAgent extends Agent {
    
    private static final String name = "Random";
    private static final Random random = new Random();

    public RandomAgent() {}

    public int playMove() {
        int move = random.nextInt(2);
        return move;
    }

    public String toString() {
        return name;
    }

}
