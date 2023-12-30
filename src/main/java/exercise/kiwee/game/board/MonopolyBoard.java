package exercise.kiwee.game.board;

import java.util.ArrayList;
import java.util.List;

import exercise.kiwee.game.properties.Property;

public class MonopolyBoard {

    private static MonopolyBoard instance;
    private final List<Property> properties;
    
    private MonopolyBoard() {
        properties = initialize();
    }

    private static List<Property> initialize() {
        return new ArrayList<>();
    }
    
    public static MonopolyBoard getInstance() {
        if (instance != null) {
            return instance;
        }

        instance = new MonopolyBoard();
        return instance;
    }
    
    public Property getPosition(int position) {
        return properties.get(position);
    }
    
}
