package exercise.kiwee.game.board;

import java.util.LinkedList;

import exercise.kiwee.game.properties.Property;


public class MonopolyBoard {

    private static MonopolyBoard instance;
    private LinkedList<Property> properties;

    private MonopolyBoard() {
        properties = new LinkedList<>();
    }

    public static MonopolyBoard getInstance() {
        if (instance != null) {
            return instance;
        }

        instance = new MonopolyBoard();
        return instance;
    }

    
    
}
